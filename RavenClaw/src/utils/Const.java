package utils;

public class Const {
	// D: structure describing a particular forced update
	public static final int FCU_EXPLICIT_CONFIRM =	1;
	public static final int FCU_IMPLICIT_CONFIRM =	2;
	public static final int FCU_UNPLANNED_IMPLICIT_CONFIRM = 3;
	//
	public static final String IET_DIALOG_STATE_CHANGE = "dialog_state_change";
	public static final String IET_USER_UTT_START = "user_utterance_start";
	public static final String IET_USER_UTT_END = "user_utterance_end";
	public static final String IET_PARTIAL_USER_UTT = "partial_user_utterance";
	public static final String IET_SYSTEM_UTT_START = "system_utterance_start";
	public static final String IET_SYSTEM_UTT_END = "system_utterance_end";
	public static final String IET_SYSTEM_UTT_CANCELED = "system_utterance_canceled";
	public static final String IET_FLOOR_OWNER_CHANGES = "floor_owner_changes";
	public static final String IET_SESSION = "session";
	public static final String IET_GUI = "gui";

	
	// D: Topic-initiative: bind concepts only within the current topic / focus
	public static final String WITHIN_TOPIC_ONLY = "bind-this-only";

	// D: Mixed-initiative: bind anything
	public static final String MIXED_INITIATIVE = "bind-anything";
	// D: type describing a concept grounding request
	public static final int GRS_UNPROCESSED= 0;	// the unprocessed status for a grounding request
	public static final int GRS_PENDING    = 1	;	// the pending status for a grounding request
	public static final int GRS_READY      = 2   ;    // the ready status for a grounding request
	public static final int GRS_SCHEDULED  = 3	;	// the scheduled status for a grounding request
	public static final int GRS_EXECUTING  = 5	;	// the executing status for a grounding request
	public static final int GRS_DONE       = 6   ;	// the completed status for a grounding request
	
	// Log tag
	public static final String LAUNCHAPP_TAG = "LaunchApp";
	public static final String DMCORE_STREAM_TAG = "DMCORE";
	public static final String EXPECTATIONAGENDA_STREAM_TAG = "ExpectAgent";
	public static final String CREATE_STREAM_TAG = "CREATE";
	public static final String STATEMANAGER_STREAM_TAG = "StateManager";
	public static final String GROUNDINGMANAGER_STREAM_TAG = "GroundManger";
	public static final String CDTTMANAGER_STREAM = "DttManager";
	public static final String DIALOGTASK_STREAM = "DialogTask";
	public static final String CDATEHYP_TAG = "CDateHyp";
	public static final String CONCEPT_TAG = "CHyp";
	public static final String CSTRING_TAG = "CStringHyp";
	public static final String CSTRUCT_TAG = "CStructConcept";
	public static final String WARNING_STREAM = "InteractionEvent";
	public static final String DIALOGTASK_STREAM_TAG = "DialogTask";
	public static final String INPUTMANAGER_STREAM = "InputManager";
	public static final String CORETHREAD_STREAM = "CoreThread";
	public static final String CONCEPT_STREAM_TAG="Concept";
	public static final String CDATECONCEPT = "CDateConcept";
	public static final String EXECUTE_STREAM_TAG = "CMAExecuteAgent";
	public static final String FLIGHT_DATABASE = "CFlightDatabase";
	
	public static final int ASK_USER_INPUT = 1;
	public static final int CALL_UNDERSTAND = 2;
	public static final int OUTPUT_COMPLETED = 3;
	
	// D: structure describing system actions taken on a particular concept
	public static final String SA_REQUEST = "REQ";
	public static final String SA_EXPL_CONF	="EC";
	public static final String SA_IMPL_CONF	="IC";
	public static final String SA_UNPLANNED_IMPL_CONF= "UIC";
	public static final String SA_OTHER="OTH";
	
	// D: definition of default cardinality
	public static final int DEFAULT_HYPSET_CARDINALITY = 1000;
	// L: definition of Message.what
	public static final int CHANGEBACKGROUND = 1;
	public static final int FINISHDIALOG = 2;
	
	// D: definition of the probability mass that always remains free (is assigned
	//	    to others)
	public static final float FREE_PROB_MASS =((float)0.05);
	// D: define concept update types
	public static final String CU_ASSIGN_FROM_STRING="assign_from_string";
	public static final String CU_ASSIGN_FROM_CONCEPT="assign_from_concept";
	public static final String CU_UPDATE_WITH_CONCEPT="update_with_concept";
	public static final String CU_COLLAPSE_TO_MODE   ="collapse_to_mode";
	public static final String CU_PARTIAL_FROM_STRING="partial_from_string";
	
	public static final String ABSTRACT_CONCEPT ="<ABSTRACT>\n";
	public static final String UNDEFINED_CONCEPT ="<UNDEFINED>\n";
	public static final String INVALIDATED_CONCEPT= "<INVALIDATED>\n";
	public static final String UNDEFINED_VALUE= "<UNDEF_VAL>";
	
	public static final String[] vsGRS = new String[]{
		"UNPROCESSED", "PENDING", "READY", "SCHEDULED", 
        "ONSTACK", "EXECUTING", "DONE"};
	public static final String CityAirport="�Ϻ����Ż���,�Ϻ��ֶ�����,�Ͼ�»�ڻ���,��ͨ�˶�����,����˶�Ż���,���ݱ�ţ����,���ݹ�������,�γ��������,���Ƹ۰���������,������ɽ����,�����������,������ǿ����,��ɽ����ɽ����,����·�Ż���,���ݻ���,���ڻ��� ,����ңǽ����,�ൺ��ͤ����,������ˮ������,��̨��ɽ����,�����岺�����,Ϋ����Է����,��Ӫ��������,��������,���ݳ��ֻ���,���Ÿ������,Ȫ�ݽ�������,���ҹ���ɽ����,����ɽ���� ,�ϲ���������,���ݻƽ����,�Ž�®ɽ����,�������޼һ���,����ɽ����,�Ϸ���ڻ���,��ɽ��Ϫ����,��������ɽ����,�������ػ��� ,�����׶�����,������Է����  ,����������,ʯ��ׯ��������,�ػʵ�ɽ���ػ��� ,̫ԭ���޻���,��ͬ���ʻ���,�����������,�˳ǹع�����,���ͺ��ذ�������,��������ɽ����,���������,����������,�������ػ���,���ֺ��ػ���,�ں�����,��ͷ�����,ͨ�ɻ���,�������ɻ���,������ˮ��,����С����,������ͷ,�������� ,�������λ���,���ֶ�̨��,�Ӽ������� ,������̫ƽ����,�������������,��ľ˹����,ĵ��������,�ںӻ���,������������,��������,�Ӱ���ʮ����,������ɳ,����������  ,�����д�����,�ػͻ���,�����ػ���,�������� ,�����ܼұ�����,���ľ����,�����Ӷ�����,��³ľ������̻���,����������,��ʲ����,��������,���ǻ���,����̩����,�⳵����,��ĩ����,�������,����ջ���,���������,���̻���,��³������,���ݰ��ƻ���,���ڱ�������,�麣����,��ͷ��ɰ,տ������,÷�ػ���,�������׻���,��������,���ݰ���,��������,���ݳ��޵�,������������,���Ƿ�˻���,�人��ӻ���,�˲���Ͽ,����ɳ��,�差����,��ʩ���ƺ ,��ɳ�ƻ�����,�żҽ�ɻ�,�����һ�Դ,��������,�����ƽ�,֣����֣����,��������,������Ӫ,���콭������,�������� ,�ɶ�˫������,��������,��կ������,��֦������Ӫ,�ϳ��ƺ,�˱�����,�����Ͻ�,������ɽ,��Ԫ����,���ݺ���,�����׼Ұӻ���,�����������,�º�â��,��ɽ�ƶ�,���������������,��˫���ɻ���,��ɽ���ߺ�,�������,˼é����,�ٲ׻���,��ͨ���� ,��������������,ͭ�ʴ���,��˳�ƹ���,�������,��ƽ���� ,�������»���,����������";
	
	
		
	
}
