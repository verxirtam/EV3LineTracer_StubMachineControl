package rl.linetracer;

import java.util.Random;





public class MachineControl
{
	private Random Random;
	
	public static final int LED_PATTERN_OFF                  =0;
	public static final int LED_PATTERN_STATIC_GREEN         =1;
	public static final int LED_PATTERN_STATIC_RED           =2;
	public static final int LED_PATTERN_STATIC_YELLOW        =3;
	public static final int LED_PATTERN_NORMALBLINKING_GREEN =4;
	public static final int LED_PATTERN_NORMALBLINKING_RED   =5;
	public static final int LED_PATTERN_NORMALBLINKING_YELLOW=6;
	public static final int LED_PATTERN_FASTBLINKING_GREEN   =7;
	public static final int LED_PATTERN_FASTBLINKING_RED     =8;
	public static final int LED_PATTERN_FASTBLINKING_YELLOW  =9;

	
	public MachineControl()
	{
		Random=new Random();
	}
	//指定したスピードで前進
	public void GoForward(int lspeed, int rspeed)
	{

	}
	//停止する
	public void Stop()
	{

	}
	//SubSensorから色を検知する
	public int GetColor()
	{
		int r=Random.nextInt(10);
		
		if(r==0)
		{
			return 0;//red
		}
		if(r<10)
		{
			return 6;//white
		}
		
		return 2;//blue
	}
	public float GetReflection()
	{
		return 0.0f;
	}
	//後退する
	public void GoBack(int lspeed, int rspeed)
	{
	}
	//LineSensorで黒線を検知する
	public boolean OnBlackLine()
	{
		return true;
	}
	public void OnLED(int pattern)
	{
	}
	public void Delay(int i)
	{
		
	}
	public boolean IsEscapeButtonDown()
	{
		return false;
	}
}
