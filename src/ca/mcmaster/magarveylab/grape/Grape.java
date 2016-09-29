package ca.mcmaster.magarveylab.grape;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.exception.InvalidSmilesException;

import ca.mcmaster.magarveylab.grape.nrp.chem.ChemicalAbstraction;
import ca.mcmaster.magarveylab.grape.nrp.chem.NRPPredictor;
import ca.mcmaster.magarveylab.grape.util.ChemicalUtilities;
import ca.mcmaster.magarveylab.grape.util.io.ImageOutput;
import ca.mcmaster.magarveylab.grape.util.io.JsonOutput;
import ca.mcmaster.magarveylab.grape.util.io.ReadFile;
import ca.mcmaster.magarveylab.grape.util.io.TextOutput;

public class Grape {
	
	NRPPredictor predictor;
	private GrapeConfig gc;

	public Grape(GrapeConfig gc){
		this.gc = gc;
		predictor =  new NRPPredictor("data/monomer_types/amino_acids_with_domains.txt", gc.fungal());
	}
	
	/**
	 * Run the analysis
	 * @throws InvalidSmilesException 
	 */
	public void run() throws IOException, InvalidSmilesException{
		
		if(!gc.getSmiles().isEmpty()){ //Single compound to run
			ChemicalAbstraction chemicalAbstraction = ChemicalUtilities.getChemicalAbstractionFromSmiles(gc.getSmiles(), predictor);
			if(gc.txt()){
				String textOutput = TextOutput.createOutputFile(chemicalAbstraction);
				if(!gc.getName().isEmpty()){
					TextOutput.writeFile(textOutput, gc.getName() + ".txt");
				}else if(!gc.getID().isEmpty()){
					TextOutput.writeFile(textOutput, gc.getID() + ".txt");
				}else{
					TextOutput.writeFile(textOutput, "output.txt");
				}	
			}
			if(gc.json()){
				JsonOutput.writeJSON(gc.getName(), gc.getSmiles(), gc.getID(), chemicalAbstraction);
			}
			if(gc.image()){
				try {
					ImageOutput.createReport(gc.getName(), gc.getSmiles(), gc.getID(), chemicalAbstraction);
				} catch (CDKException e) {
					System.err.println("Could not draw molecule");
				}
			}							
		}else if(gc.getFile() != null){ //many compounds to run
			Map<String, String> inputData = ReadFile.read(gc.getFile());
			for(Entry<String, String> single : inputData.entrySet()){
				String name = single.getKey();
				String smiles = single.getValue().replace(" ", "");
				System.out.println("Working on: " + name);
				ChemicalAbstraction chemicalAbstraction = ChemicalUtilities.getChemicalAbstractionFromSmiles(smiles, predictor);
				if(chemicalAbstraction.errored()){
					System.err.println(chemicalAbstraction.getErrorMessage());
					continue;
				}
				if(gc.txt()){
					String textOutput = TextOutput.createOutputFile(chemicalAbstraction);
					TextOutput.writeFile(textOutput, name + ".txt");
				}
				if(gc.json()){
					JsonOutput.writeJSON(name, smiles, name, chemicalAbstraction);
				}
				if(gc.image()){
					try{
						ImageOutput.createReport(name, smiles, name, chemicalAbstraction);
					}catch(CDKException e){
						System.err.println("Could not draw: " + name);
					}
				}
			}
		}
	}
}