package dmcore.outputs;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.util.Log;

import com.iflytek.cloud.speech.SpeechError;
import com.iflytek.cloud.speech.SpeechSynthesizer;
import com.iflytek.cloud.speech.SynthesizerListener;

import dmcore.agents.coreagents.DMCore;
import dmcore.agents.dialogagents.CMAInform;

public class MyOutput extends Application implements SynthesizerListener{
	
	//�ϳɶ���.
	private SpeechSynthesizer mSpeechSynthesizer;
	
	private static Context context; 

	public void onCreate() {
		super.onCreate();
		MyOutput.context = getApplicationContext();
	}

	public static Context getAppContext() {
		return MyOutput.context;
	}
	
	//-------------------------------------------------------------------------
	// Constructor
	//-------------------------------------------------------------------------
	public MyOutput(){
		
	}
	public void SetParameter(){
		if (mSpeechSynthesizer == null) {
			//�����ϳɶ���.
			mSpeechSynthesizer = SpeechSynthesizer.createSynthesizer(context);
		}
	}
	/**
	 * ʹ��SpeechSynthesizer�ϳ��������������ϳ�Dialog.
	 * @param
	 */
	public void synthetizeInSilence(String SourceText) {
		//���������ϳ�.
		mSpeechSynthesizer.startSpeaking(SourceText, this);
		
	}
	
	@Override
	public void onBufferProgress(int arg0, int arg1, int arg2, String arg3) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onCompleted(SpeechError error) {
		// TODO Auto-generated method stub
		Log.e("haha",""+Thread.currentThread().getId());
		
		if(error==null){
			DMCore.pDMCore.GetAgentInFocus().bOutputCompleted=true;
		}
		
	}
	@Override
	public void onSpeakBegin() {
		// TODO Auto-generated method stub
	}
	@Override
	public void onSpeakPaused() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onSpeakProgress(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onSpeakResumed() {
		// TODO Auto-generated method stub
		
	}

}
