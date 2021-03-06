package ca.mcmaster.magarveylab.grape.enums;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openscience.cdk.interfaces.IAtomContainer;

public enum FattyAcidsEnums {
	C16_1_7("C16:1(7)", "7-hexadecenoic acid", "C(CCCCCC=CCCCCCCCC)(=O)O"),
	C10_0("C10:0", "decanoic acid", "CCCCCCCCCC(=O)O"),
	C12_0("C12:0", "dodecanoic acid", "CCCCCCCCCCCC(=O)O"),
	C10_0_NH2_2_OXO_8("C10:0-NH2(2)-oxo(8)", "2-amino-8-oxo-decanoic acid", "C(C(N)CCCCCC(CC)=O)(=O)O"),
	C10_0_OH_8_NH2_2("C10:0-OH(8)-NH2(2)", "8-hydroxy-2-amino-decanoic acid", "C(C(N)CCCCCC(CC)O)(=O)O"),
	C10_0_OH_9_NH2_2("C10:0-OH(9)-NH2(2)", "9-hydroxy-2-amino-decanoic acid", "C(C(N)CCCCCCC(C)O)(=O)O"),
	C10_0_OH_9_NH2_2_OXO_8("C10:0-OH(9)-NH2(2)-oxo(8)", "9-hydroxy-2-amino-8-oxo-decanoic acid", "C(C(N)CCCCCC(C(C)O)=O)(=O)O"),
	C14_0("C14:0", "tetradecanoic acid", "CCCCCCCCCCCCCC(=O)O"),
	C16_0("C16:0", "hexadecanoic acid", "CCCCCCCCCCCCCCCC(=O)O"),
	C4_0("C4:0", "butanoic acid", "CCCC(=O)O"),
	C6_0("C6:0", "hexanoic acid", "CCCCCC(=O)O"),
	C18_1_9("C18:1(9)", "9-octadecenoic acid", "CCCCCCCCC=CCCCCCCCC(=O)O"),
	C4_0_OH_2_3_4("C4:0-OH(2.3.4)", "2,3,4-trihydroxy-butanoic acid", "C(C(C(C(=O)O)O)O)O"),
	C5_0_NH2_3("C5:0-NH2(3)", "3-amino-pentanoic acid", "CCC(CC(=O)O)N"),
	C8_2_2_T4("C8:2(2.t4)", "2,trans4-octenoic acid", "C(C=CC=CCCC)(=O)O"),
	C7_0("C7:0", "heptanoic acid", "CCCCCCC(=O)O"),
	C8_0_1_7("C8:0:1(7)", "oct-7-ynoic acid", "C#CCCCCCC(=O)O"),
	C9_0("C9:0", "nonanoic acid", "CCCCCCCCC(=O)O"),
	IC14_0_NH2_3("iC14:0-NH2(3)", "3-amino-12-methyl-tridecanoic acid", "CC(C)CCCCCCCCC(CC(=O)O)N"),
	C13_0_NH2_3("C13:0-NH2(3)", "3-amino-tridecanoic acid", "C(CC(CCCCCCCCCC)N)(O)=O"),
	IC11_0("iC11:0", "9-methyldecanoic acid", "CC(C)CCCCCCCC(=O)O"),
	AC15_1_3("aC15:1(3)", "12-methyl-3-tetradecenoic acid", "C(CC=CCCCCCCCC(CC)C)(O)=O"),
	AC17_0_NH2_3("aC17:0-NH2(3)", "3-amino-14-methyl-hexadecanoic acid", "C(CC(CCCCCCCCCCC(CC)C)N)(O)=O"),
	C14_1_7("C14:1(7)", "7-tetradecenoic acid", "C(CCCCCC=CCCCCCC)(O)=O"),
	IC10_0("iC10:0", "8-methylnonanoic acid", "CC(C)CCCCCCC(=O)O"),
	IC12_0("iC12:0", "10-methylundecanoic acid", "CC(C)CCCCCCCCC(=O)O"),
	IC13_0("iC13:0", "11-methyldodecanoic acid", "CC(C)CCCCCCCCCC(=O)O"),
	IC14_0("iC14:0", "12-methyl-tridecanoic acid", "CC(C)CCCCCCCCCCC(=O)O"),
	IC5_0_OH_2_CA_4("iC5:0-OH(2)-CA(4)", "2-hydroxy-3-methyl-butanedioic acid", "CC(C(C(=O)O)O)C(=O)O"),
	IC7_0("iC7:0", "5-methyl-hexanoic acid", "CC(C)CCCC(=O)O"),
	IC8_0("iC8:0", "6-methylheptanoic acid", "CC(C)CCCCC(=O)O"),
	IC9_0("iC9:0", "7-methyloctanoic acid", "CC(C)CCCCCC(=O)O"),
	IC10_2_2_T4("iC10:2(2.t4)", "2,trans4-8-methyl-noneoic acid", "C(C=CC=CCCC(C)C)(O)=O"),
	C16_1_9("C16:1(9)", "9-hexadecenoic acid", "CCCCCCC=CCCCCCCCC(=O)O"),
	IC12_2_2_T4("iC12:2(2.t4)", "10-methyl-2,trans4-undecanoic acid", "C(C=CC=CCCCCC(C)C)(O)=O"),
	IC13_1_3("iC13:1(3)", "11-methyl-3-dodecenoic acid", "C(CC=CCCCCCCC(C)C)(O)=O"),
	IC15_0_NH2_3("iC15:0-NH2(3)", "3-amino-13-methyl-tetradecanoic acid", "C(CC(CCCCCCCCCC(C)C)N)(O)=O"),
	IC16_0_NH2_3("iC16:0-NH2(3)", "3-amino-14-methyl-pentadecanoic acid", "C(CC(CCCCCCCCCCC(C)C)N)(O)=O"),
	IC14_1_3("iC14:1(3)", "12-methyl-3-tridecenoic acid", "C(CC=CCCCCCCCC(C)C)(O)=O"),
	IC17_0_NH2_3("iC17:0-NH2(3)", "3-amino-15-methyl-hexadecanoic acid", "C(CC(CCCCCCCCCCCC(C)C)N)(O)=O"),
	IC9_2_2_T4("iC9:2(2.t4)", "2,trans4-7-methyl-octenoic acid", "C(C=CC=CCC(C)C)(=O)O"),
	C12_1_5("C12:1(5)", "2-methyl-5-dodecenoic acid", "CCCCCCC=CCCCC(=O)O"),
	C14_0_NH2_3("C14:0-NH2(3)", "3-amino-tetradecanoic acid", "CCCCCCCCCCCC(CC(=O)O)N"),
	C16_0_NH2_3("C16:0-NH2(3)", "3-amino-hexadecanoic acid", "CCCCCCCCCCCCCC(CC(=O)O)N"),
	C8_0("C8:0", "octanoic acid", "CCCCCCCC(=O)O"),
	TIG("Tig", "tiglic acid", "C/C=C(C)/C(=O)O"),
	AC11_0("aC11:0", "8-methyldecanoic acid", "CCC(C)CCCCCCC(=O)O"),
	AC13_0("aC13:0", "10-methyldodecanoic acid", "CCC(C)CCCCCCCCC(=O)O"),
	AC15_0("aC15:0", "12-methyltetradecanoic acid", "CCC(C)CCCCCCCCCCC(=O)O"),
	AC13_1_3("aC13:1(3)", "10-methyl-3-dodecenoic acid", "C(CC=CCCCCCC(CC)C)(O)=O"),
	AC13_2_2_T4("aC13:2(2.t4)", "10-methyl-2,trans4-dodecenoic acid", "C(C=CC=CCCCCC(CC)C)(O)=O"),
	AC15_0_NH2_3("aC15:0-NH2(3)", "3-amino-12-methyl-tetradecanoic acid", "C(CC(CCCCCCCCC(CC)C)N)(O)=O"),
	C6_0_OH_3_5_NH2_4("C6:0-OH(3.5)-NH2(4)", "3.5-hydroxy-4-amino-hexadecanoic acid", "C(CC(C(C(C)O)N)O)(O)=O"),
	AC9_0("aC9:0", "6-methyloctanoic acid", "CCC(C)CCCCC(=O)O"),
	AC9_0_OH_2_NH2_3("aC9:0-OH(2)-NH2(3)", "alpha-hydroxy-6-methyl-3-aminooctanoic acid", "C(C(C(CCC(CC)C)N)O)(=O)O"),
	AC10_0("aC10:0", "7-methylnonanoic acid", "CCC(C)CCCCCC(=O)O"),
	C15_0_NH2_3("C15:0-NH2(3)", "3-amino-pentadecanoic acid", "C(CC(CCCCCCCCCCCC)N)(O)=O"),
	C13_0_OH_3("C13:0-OH(3)", "3-hydroxy-tridecanoic acid", "CCCCCCCCCCC(CC(=O)O)O"),
	AC17_0_OH_3("aC17:0-OH(3)", "3-hydroxy-14-methyl-hexadecanoic acid", "C(CC(CCCCCCCCCCC(CC)C)O)(O)=O"),
	C11_0_OH_3("C11:0-OH(3)", "3-hydroxy-undecanoic acid", "CCCCCCCCC(CC(=O)O)O"),
	C14_0_OH_3_4("C14:0-OH(3.4)", "3,4-dihydroxy-tetradecanoic acid", "CCCCCCCCCCC(C(CC(=O)O)O)O"),
	AC15_0_OH_3("aC15:0-OH(3)", "3-hydroxy-12-methyl-tetradecanoic acid", "C(CC(CCCCCCCCC(CC)C)O)(O)=O"),
	C15_2_T4_T6_OH_2_3("C15:2(t4.t6)-OH(2.3)", "2,3-dihydroxy-trans4,trans6-pentadecenoic acid", "C(C(C(C=CC=CCCCCCCCC)O)O)(O)=O"),
	C16_1_9_OH_3("C16:1(9)-OH(3)", "3-hydroxy-9-hexadecenoic acid", "C(CC(CCCCCC=CCCCCCC)O)(O)=O"),
	C18_1_9_OH_3("C18:1(9)-OH(3)", "3-hydroxy-9-octadecenoic acid", "C(CC(CCCCCC=CCCCCCCCC)O)(O)=O"),
	AC6_0_OH_2_3("aC6:0-OH(2.3)", "2,3-dihydroxy-3-methylpentanoic acid", "CCC(C)(C(C(=O)O)O)O"),
	AC9_0_OH_3("aC9:0-OH(3)", "3-hydroxy-6-methyloctanoic acid", "CCC(C)CCC(CC(=O)O)O"),
	C14_2_T4_T6_OH_2_3("C14:2(t4.t6)-OH(2.3)", "2,3-dihydroxy-trans4,trans6-tetradecenoic acid", "C(C(C(C=CC=CCCCCCCC)O)O)(O)=O"),
	C10_0_OH_3("C10:0-OH(3)", "3-hydroxy-decanoic acid", "CCCCCCCC(CC(=O)O)O"),
	C12_0_OH_3("C12:0-OH(3)", "3-hydroxy-dodecanoic acid", "CCCCCCCCCC(CC(=O)O)O"),
	C15_0_OH_3("C15:0-OH(3)", "3-hydroxy-pentadecanoic acid", "CCCCCCCCCCCCC(CC(=O)O)O"),
	C16_0_OH_3_4("C16:0-OH(3.4)", "3,4-dihydroxy-hexadecanoic acid", "CCCCCCCCCCCCC(C(CC(=O)O)O)O"),
	AC11_2_4_6_ME_2_6_OH_2_3("aC11:2(4.6)-Me(2.6)-OH(2.3)", "2,3-dihydroxy-2,6,8-trimethyldeca-(4Z,6E)-dienoic acid", "C(C(C(C=CC(=CC(CC)C)C)O)(O)C)(O)=O"),
	C16_0_OH_3("C16:0-OH(3)", "3-hydroxy-hexadecanoic acid", "CCCCCCCCCCCCCC(CC(=O)O)O"),
	AC13_0_OH_3("aC13:0-OH(3)", "3-hydroxy-10-methyl-dodecanoic acid", "C(CC(CCCCCCC(CC)C)O)(O)=O"),
	C14_0_OH_3("C14:0-OH(3)", "3-hydroxy-tetradecanoic acid", "CCCCCCCCCCCC(CC(=O)O)O"),
	C4_0_OH_3("C4:0-OH(3)", "3-hydroxybutanoic acid", "CC(CC(=O)O)O"),
	C4_1_3_OH_2("C4:1(3)-OH(2)", "2-hydroxy-3-butenoic acid", "C=CC(C(=O)O)O"),
	C8_1_7_ME_2_2_OH_3("C8:1(7)-Me(2.2)-OH(3)", "2,2-dimethyl-3-hydroxy-7-octenoic acid", "C(C(C(CCCC=C)O)(C)C)(O)=O"),
	C4_0_OH_2_3("C4:0-OH(2.3)", "2,3-dihydroxy-butanoic acid", "CC(C(C(=O)O)O)O"),
	C9_1_4_ME_2_4_6_OH_8("C9:1(4)-Me(2.4.6)-OH(8)", "8-hydroxy-2,4,6-trimethyl-4-nonenoic acid", "C(C(CC(=CC(CC(C)O)C)C)C)(O)=O"),
	C6_0_OH_3("C6:0-OH(3)", "3-hydroxy-hexanoic acid", "CCCC(CC(=O)O)O"),
	C8_0_OH_3("C8:0-OH(3)", "3-hydroxy-octanoic acid", "CCCCCC(CC(=O)O)O"),
	C11_2_T2_T8_ME_2_6_8_OH_5_7("C11:2(t2.t8)-Me(2.6.8)-OH(5.7)", "2,6,8-trimethyl-5,7-dihydroxy-trans2,trans8-undecenoic acid", "C(C(=CCC(C(C(C(=CCC)C)O)C)O)C)(O)=O"),
	C12_1_5_OH_3("C12:1(5)-OH(3)", "3-hydroxy-5-dodecenoic acid", "C(CC(CC=CCCCCCC)O)(O)=O"),
	IC5_0_OH_2_4("iC5:0-OH(2.4)", "2,4-dihydroxy-3-methyl-butanoic acid", "C(C(C(CO)C)O)(=O)O"),
	IC13_0_OH_3("iC13:0-OH(3)", "3-hydroxy-11-methyl-dodecanoic acid", "CC(C)CCCCCCCC(CC(=O)O)O"),
	IC15_0_OH_3("iC15:0-OH(3)", "3-hydroxy-13-methyl-tetradecanoic acid", "CC(C)CCCCCCCCCC(CC(=O)O)O"),
	IC5_0_OH_2_3("iC5:0-OH(2.3)", "2,3-dihydroxy-3-methyl-butanoic acid", "CC(C)(C(C(=O)O)O)O"),
	C7_0_OH_3("C7:0-OH(3)", "3-hydroxy-heptanoic acid", "CCCCC(CC(=O)O)O"),
	C9_0_OH_3("C9:0-OH(3)", "3-hydroxy-nonanoic acid", "CCCCCCC(CC(=O)O)O"),
	IC14_0_OH_3("iC14:0-OH(3)", "3-hydroxy-12-methyl-tridecanoic acid", "CC(C)CCCCCCCCC(CC(=O)O)O"),
	IC16_0_OH_3("iC16:0-OH(3)", "3-hydroxy-14-methyl-pentadecanoic acid", "C(CC(CCCCCCCCCCC(C)C)O)(O)=O"),
	IC9_0_OH_3("iC9:0-OH(3)", "3-hydroxy-7-methyl-octanoic acid", "CC(C)CCCC(CC(=O)O)O"),
	C13_2_T4_T6_OH_2_3("C13:2(t4.t6)-OH(2.3)", "2,3-dihydroxy-trans4,trans6-tridecenoic acid", "C(C(C(C=CC=CCCCCCC)O)O)(O)=O"),
	IC11_0_OH_3("iC11:0-OH(3)", "3-hydroxy-9-methyl-decanoic acid", "CC(C)CCCCCC(CC(=O)O)O"),
	IC12_0_OH_3("iC12:0-OH(3)", "3-hydroxy-10-methyl-undecanoic acid", "CC(C)CCCCCCC(CC(=O)O)O"),
	IC17_0_OH_3("iC17:0-OH(3)", "3-hydroxy-15-methyl-hexadecanoic acid", "CC(C)CCCCCCCCCCCC(CC(=O)O)O"),
	C4_0_OH_2_3_CL_4("C4:0-OH(2.3)-Cl(4)", "2,3-dihydroxy-4-chloro-butanoic acid", "C(C(C(CCl)O)O)(=O)O"),
	C6_0_ME_2_NH2_3("C6:0-Me(2)-NH2(3)", "2-methyl-3-aminohexadecanoic acid", "C(C(C(CCC)N)C)(=O)O"),
	C7_0_ME_2_OH_3("C7:0-Me(2)-OH(3)", "3-hydroxy-2-methyl-heptanoic acid", "C(C(C(CCCC)O)C)(O)=O"),
	C10_0_ME_2_2_4_OH_3_7("C10:0-Me(2.2.4)-OH(3.7)", "3-hydroxy-2,2,4-trimethyl-7-hydroxydecanoic acid", "C(C(C(C(=O)O)(C)C)O)(CCC(CCC)O)C"),
	C10_0_ME_2_2_4_OH_3_OME_7("C10:0-Me(2.2.4)-OH(3)-OMe(7)", "3-hydroxy-2,2,4-trimethyl-7-methoxydecanoic acid", "C(C(C(C(O)=O)(C)C)O)(CCC(CCC)OC)C"),
	C8_0_ME_2_2_OH_3("C8:0-Me(2.2)-OH(3)", "2,2-dimethyl-3-hydroxy-octanoic acid", "C(C(C(CCCCC)O)(C)C)(O)=O"),
	C4_0_OH_2_EP_3("C4:0-OH(2)-Ep(3)", "2-hydroxy-3-epoxy-butanoic acid", "C1C(O1)C(C(=O)O)O"),
	C6_0_OME_3("C6:0-OMe(3)", "3-methoxy-hexanoic acid", "CCCC(CC(=O)O)OC"),
	C6_0_ME_5_5_OXO_2("C6:0-Me(5.5)-oxo(2)", "5,5-dimethyl-2-oxo-hexanoic acid", "CC(C)(C)CCC(=O)C(=O)O"),
	C6_0_EP_2("C6:0-Ep(2)", "2-epoxy-hexanoic acid", "CCCC1C(O1)C(=O)O"),
	C11_0_ME_2_OH_3("C11:0-Me(2)-OH(3)", "3-hydroxy-2-methyl-undecanoic acid", "CCCCCCCCC(C(C)C(=O)O)O"),
	C10_0_NH2_2_EP_9_OXO_8("C10:0-NH2(2)-Ep(9)-oxo(8)", "2-amino-9,10-epoxi-8-oxodecanoic acid", "C1C(O1)C(=O)CCCCCC(C(=O)O)N"),
	C10_0_ME_2_OH_3("C10:0-Me(2)-OH(3)", "3-hydroxy-2-methyl-decanoic acid", "CCCCCCCC(C(C)C(=O)O)O"),
	IC8_0_ME_2_4_OH_3("iC8:0-Me(2.4)-OH(3)", "2,4,6-trimethyl-3-hydroxy-heptanoic acid", "C(C(C(C(CC(C)C)C)O)C)(=O)O"),
	C12_3_7_9_11_ME_6_OH_2_4_5_NH2_3_PH_12("C12:3(7.9.11)-Me(6)-OH(2.4.5)-NH2(3)-Ph(12)", "3-amino-6-methyl-12-phenyl-2,4,5-trihydroxydodeca-7,9,11-trienoic acid", "C(C(C(C(C(C(C=CC=CC=CC1=CC=CC=C1)C)O)O)N)O)(O)=O"),
	C12_3_7_9_11_ME_6_10_OH_2_4_5_NH2_3_PH_12("C12:3(7.9.11)-Me(6.10)-OH(2.4.5)-NH2(3)-Ph(12)", "3-amino-6,10-dimethyl-12-phenyl-2,4,5-trihydroxydodeca-7,9,11-trienoic acid", "C(C(C(C(C(C(C=CC=C(C=CC1=CC=CC=C1)C)C)O)O)N)O)(O)=O"),
	C9_1_8_ME_2("C9:1(8)-Me(2)", "2-methyl-8-noneic acid", "CC(CCCCCC=C)C(=O)O"),
	C9_0_ME_2_OH_3("C9:0-Me(2)-OH(3)", "3-hydroxy-2-methyl-nonanoic acid", "CCCCCCC(C(C)C(=O)O)O"),
	C8_0_ME_4_OH_3("C8:0-Me(4)-OH(3)", "4-methyl-3-hydroxy-octanoic acid", "CCCCC(C)C(CC(=O)O)O"),
	C8_1_7_OH_2_4_5_NH2_3_PH_8("C8:1(7)-OH(2.4.5)-NH2(3)-Ph(8)", "3-amino-8-phenyl-2.4.5-trihydroxyoct-7-enoic acid", "C(C(C(C(C(CC=CC1=CC=CC=C1)O)O)N)O)(O)=O"),
	C9_1_ME4_ME_2_4_6_OH_8_OXO_5("C9:1(Me4)-Me(2.4.6)-OH(8)-Oxo(5)", "5-oxo-8-hydroxy-2,4,6-trimethyl-4-nonaneic acid", "C(C(CC(C(C(CC(C)O)C)=O)=C)C)(O)=O"),
	C10_2_7_9_OH_2_4_5_NH2_3_EPH_10("C10:2(7.9)-OH(2.4.5)-NH2(3)-ePh(10)", "3-amino-10-(p-ethoxyphenyl)-2,4,5-trihydroxydeca-7,9-dienoic acid", "C(C(C(C(C(CC=CC=CC1=CC=C(C=C1)OCC)O)O)N)O)(O)=O"),
	C10_0_ME_4_OH_3("C10:0-Me(4)-OH(3)", "3-hydroxy-4-methyl-decanoic acid", "C(CC(C(CCCCCC)C)O)(O)=O"),
	C10_0_ME_2_4_OXO_9("C10:0-Me(2.4)-oxo(9)", "9-oxo-2,4-dimethyldecanoic acid", "C(C(CC(CCCCC(C)=O)C)C)(=O)O"),
	C10_0_1_9_ME_2_4("C10:0:1(9)-Me(2.4)", "2,4-dimethyl-dec-9-ynoic acid", "C(C(CC(CCCCC#C)C)C)(=O)O"),
	C8_2_5_7_ME_6_OH_4_NH2_3_PH_8("C8:2(5.7)-Me(6)-OH(4)-NH2(3)-Ph(8)", "3-amino-4-hydroxy-6-methyl-8-phenyl-5,7-octadienoic acid", "C(CC(C(C=C(C=CC1=CC=CC=C1)C)O)N)(=O)O"),
	C8_2_5_7_ME_6_OH_4_NH2_3_BRPH_8("C8:2(5.7)-Me(6)-OH(4)-NH2(3)-brPh(8)", "3-amino-4-hydroxy-6-methyl-8-(p-bromophenyl)-5,7-octadienoic acid", "C(CC(C(C=C(C=CC1=CC=C(C=C1)Br)C)O)N)(=O)O"),
	C12_1_11_ME_6_OH_2_4_5_NH2_3_MPHE_11("C12:1(11)-Me(6)-OH(2.4.5)-NH2(3)-mPhe(11)", "3-amino-6-methyl-12-(p-methoxyphenyl)-2,4,5-trihydroxydodec-11-enoic acid", "C(C(C(C(C(C(CCCCC=CC1=CC=C(C=C1)OC)C)O)O)N)O)(O)=O"),
	C6_0_ME_2_2_OH_3("C6:0-Me(2.2)-OH(3)", "2,2-dimethyl-3-hydroxyhexanoic acid", "CCCC(C(C(=O)O)(C)C)O"),
	C4_0_ME_2("C4:0-Me(2)", "2-methyl-butanoic acid", "CCC(C)C(=O)O"),
	C8_0_1_7_ME_2_OH_3("C8:0:1(7)-Me(2)-OH(3)", "2-methyl-3-hydroxy-7-octynoic acid", "C(C(C(CCCC#C)O)C)(O)=O"),
	C8_0_1_7_ME_2_NH2_3("C8:0:1(7)-Me(2)-NH2(3)", "3-amino-2-methyloct-7-ynoic acid", "C(CCCC#C)(C(C(=O)O)C)N"),
	C8_0_1_7_ME_2_2_OH_3("C8:0:1(7)-Me(2.2)-OH(3)", "2,2-dimethyl-3-hydroxy-7-octynoic acid", "C(C(C(CCCC#C)O)(C)C)(O)=O"),
	C8_0_1_7_ME_2("C8:0:1(7)-Me(2)", "2-methylact-7-ynoic acid", "C(C(CCCCC#C)C)(O)=O"),
	;
	
	private final String abbreviation;
	private final String name;
	private final String smiles;
	private FattyAcidsEnums(final String abbreviation, final String name, final String smiles) {
		this.abbreviation = abbreviation;
		this.name = name;
		this.smiles = smiles;
	}
	
	public static IAtomContainer[] mols(){
		IAtomContainer[] mols = new IAtomContainer[FattyAcidsEnums.values().length];
		int i = 0;
		for(FattyAcidsEnums single : FattyAcidsEnums.values()){
			mols[i] = single.mol();
			i ++;
		}
		return mols;
	}
	
	public static Map<String, IAtomContainer> getAll(){
		Map<String, IAtomContainer> all = new LinkedHashMap<String, IAtomContainer>(); 
		for(FattyAcidsEnums single : FattyAcidsEnums.values()){
			all.put(single.fullName(), single.mol());
		}
		return all;
	}
	
	public String abbreviation(){
		return abbreviation;
	}
	
	public String fullName(){
		return name;
	}
	
	public String smiles(){
		return smiles;
	}
	
	public IAtomContainer mol(){
		IAtomContainer mol = MoleculeClasses.getMol(smiles);
		return mol;
	}
	
}
