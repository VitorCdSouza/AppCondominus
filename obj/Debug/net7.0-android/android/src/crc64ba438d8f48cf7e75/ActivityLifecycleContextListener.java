package crc64ba438d8f48cf7e75;


public class ActivityLifecycleContextListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.Application.ActivityLifecycleCallbacks
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActivityCreated:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivityCreated_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityDestroyed:(Landroid/app/Activity;)V:GetOnActivityDestroyed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPaused:(Landroid/app/Activity;)V:GetOnActivityPaused_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityResumed:(Landroid/app/Activity;)V:GetOnActivityResumed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivitySaveInstanceState:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivitySaveInstanceState_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityStarted:(Landroid/app/Activity;)V:GetOnActivityStarted_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityStopped:(Landroid/app/Activity;)V:GetOnActivityStopped_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPostCreated:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivityPostCreated_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPostDestroyed:(Landroid/app/Activity;)V:GetOnActivityPostDestroyed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPostPaused:(Landroid/app/Activity;)V:GetOnActivityPostPaused_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPostResumed:(Landroid/app/Activity;)V:GetOnActivityPostResumed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPostSaveInstanceState:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivityPostSaveInstanceState_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPostStarted:(Landroid/app/Activity;)V:GetOnActivityPostStarted_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPostStopped:(Landroid/app/Activity;)V:GetOnActivityPostStopped_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPreCreated:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivityPreCreated_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPreDestroyed:(Landroid/app/Activity;)V:GetOnActivityPreDestroyed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPrePaused:(Landroid/app/Activity;)V:GetOnActivityPrePaused_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPreResumed:(Landroid/app/Activity;)V:GetOnActivityPreResumed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPreSaveInstanceState:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivityPreSaveInstanceState_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPreStarted:(Landroid/app/Activity;)V:GetOnActivityPreStarted_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActivityPreStopped:(Landroid/app/Activity;)V:GetOnActivityPreStopped_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacks, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Microsoft.Maui.ApplicationModel.ActivityLifecycleContextListener, Microsoft.Maui.Essentials", ActivityLifecycleContextListener.class, __md_methods);
	}


	public ActivityLifecycleContextListener ()
	{
		super ();
		if (getClass () == ActivityLifecycleContextListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.ApplicationModel.ActivityLifecycleContextListener, Microsoft.Maui.Essentials", "", this, new java.lang.Object[] {  });
		}
	}


	public void onActivityCreated (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivityCreated (p0, p1);
	}

	private native void n_onActivityCreated (android.app.Activity p0, android.os.Bundle p1);


	public void onActivityDestroyed (android.app.Activity p0)
	{
		n_onActivityDestroyed (p0);
	}

	private native void n_onActivityDestroyed (android.app.Activity p0);


	public void onActivityPaused (android.app.Activity p0)
	{
		n_onActivityPaused (p0);
	}

	private native void n_onActivityPaused (android.app.Activity p0);


	public void onActivityResumed (android.app.Activity p0)
	{
		n_onActivityResumed (p0);
	}

	private native void n_onActivityResumed (android.app.Activity p0);


	public void onActivitySaveInstanceState (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivitySaveInstanceState (p0, p1);
	}

	private native void n_onActivitySaveInstanceState (android.app.Activity p0, android.os.Bundle p1);


	public void onActivityStarted (android.app.Activity p0)
	{
		n_onActivityStarted (p0);
	}

	private native void n_onActivityStarted (android.app.Activity p0);


	public void onActivityStopped (android.app.Activity p0)
	{
		n_onActivityStopped (p0);
	}

	private native void n_onActivityStopped (android.app.Activity p0);


	public void onActivityPostCreated (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivityPostCreated (p0, p1);
	}

	private native void n_onActivityPostCreated (android.app.Activity p0, android.os.Bundle p1);


	public void onActivityPostDestroyed (android.app.Activity p0)
	{
		n_onActivityPostDestroyed (p0);
	}

	private native void n_onActivityPostDestroyed (android.app.Activity p0);


	public void onActivityPostPaused (android.app.Activity p0)
	{
		n_onActivityPostPaused (p0);
	}

	private native void n_onActivityPostPaused (android.app.Activity p0);


	public void onActivityPostResumed (android.app.Activity p0)
	{
		n_onActivityPostResumed (p0);
	}

	private native void n_onActivityPostResumed (android.app.Activity p0);


	public void onActivityPostSaveInstanceState (android.apUE3äD‰d$ WÀL‰bHÇB   Dˆ"ÇD$    WÉóM L‰e0Hy@H‰}˜H‹Ïèá2ÿM‹}0I‹E8IÇH‰D$0ƒÎÿL;ø„Á  I‹M(HÿÉI#ÏI‹E L‹$ÈWÀ3ÀE8EHH‰EX.:* óE HU HM8è\,íÿH‹u@H…ötğÿFH‹u@H‹E8H‰E°H‰u¸Hx I‹T$HL$pèÏíÿH‹ØA‹$HM I‹E ÿv¯ L‹ËL‹ÀHUH‹ÏèDíÿH‹UˆHƒúr2HÿÂH‹L$pH‹ÁHú   rHƒÂ'H‹IøH+ÁHƒÀøHƒø‡Í  èŸ³ 3ÿH‰}€HÇEˆ   @ˆ|$pH…öt8ƒËÿ‹ÃğÁFÃu*H‹H‹ÎH‹ ÿò® ‹ÃğÁFÃuH‹H‹ÎH‹@ÿ×® I9|$ t8IL$Iƒ|$(rI‹L$I‹D$ H‰L$`H‰D$h(D$`fEÀHUÀHMHèHwŞÿHU8HM è[íÿH‹]@ƒÎÿH…Ût5‹ÆğÁCÆu*H‹H‹ËH‹ ÿd® ‹ÆğÁCÆuH‹H‹ËH‹@ÿI® IÿÇL;|$0…CşÿÿI}@H‹E(H9E „†  3ÒDB@HM`èfÊ s8* óEĞHUĞHM`è+íÿH¸KY†8ÖÅm4I÷mHÁúH‹ÂHÁè?HĞHL$@èr¤ÿÇD$    HD$@Hƒ|$XHCD$@H‰D$0H‹D$PH‰D$8(D$0fEàHUàHMpèKvŞÿH‹T$XHƒúr<HÿÂH‹L$@H‹ÁHú   r#HƒÂ'H‹IøH+ÁHƒÀøHƒøvÿèœ ÿáœ èË± HU Hˆ   è?`íÿH‹]hH…ÛtğÿCH‹]hH‹M`H‰MğH‰]øI‹ÖèŞCŞÿH…Ût6‹ÆğÁCÆu+H‹H‹ËH‹ ÿş¬ ‹ÆğÁCÆuH‹H‹ËH‹@ÿã¬ H‹]hH…Ût6‹ÆğÁCÆu+H‹H‹ËH‹ ÿ¿¬ ‹ÆğÁCÆuH‹H‹ËH‹@ÿ¤¬ H‹Ïèÿ.ÿHM èYgßÿI‹ÆH‹    H3Ìè² H‹œ$   HÄ°  A_A^A]A\_^]ÃÌÌÌÌH‰\$WHƒì H‹úH‹ÙHƒ! Hƒa H‰T$0¹   èt° H‰D$0H…ÀtWÀ ¹   ‰H‰HHŞM* H‰H‰xH‰;H‰Cº   3Éèt° H‹ÃH‹\$8HƒÄ _ÃÌÌH‰\$ UVWHƒì A€x I‹øH‹êH‹ñu1L‹GH‹ÕH‹ÎèÕÿÿÿH‹ßH‹?HK è2
  ºÈ   H‹Ëè° € tÏH‹\$XHƒÄ _^]ÃÌÌH‰\$ UVWHƒì A€x I‹øH‹êH‹ñu1L‹GH‹ÕH‹ÎèÕÿÿÿH‹ßH‹?HK è>
  ºP   H‹ËèÁ¯ € tÏH‹\$XHƒÄ _^]ÃÌÌH‰\$H‰t$WHƒì@I‹ğH‹ú¹0   è] H‹ØH‰D$ H…Àt%óD$0L‹ÆHT$0H‹ÈèG2ÒÿHM* H‰ë3ÛH‹ÃH‹\$PH‹t$XHƒÄ@_ÃÌÌH‰\$H‰l$H‰L$VWAVHƒì@I‹ñM‹ğH‹êH‹ù¹À   èÛ® H‹ØH‰D$`H…ÀtVWÀ ¸   ‰C‰CHbL* H‰HKI‹HP H÷ØMÀL#ÂH‹„$ˆ   H‰D$(H‹„$€   H‰D$ L‹ÎH‹ÕèBà  ë3ÛWÀHCH‰H‰_H‹ÇH‹\$hH‹l$pHƒÄ@A^_^ÃÌÌÌH‰\$H‰t$H‰L$WHƒì0H‹òH‹ù¹(   è(® H‹ØH‰D$@H…Àt)WÀ ¸   ‰C‰CHÏK* H‰HKH‹è(Ì  ë3ÛWÀHCH‰H‰_H‹ÇH‹\$HH‹t$PHƒÄ0_Ã@USVWATAUAVAWH¬$XÿÿÿHì¨  H‹½#: H3ÄH‰…   M‹ñM‹àL‹êH‹ÙH‰L$XH‹…  H‰D$HH‹µ   H‹…0  H‰D$@H‰E8L‹½8  L‰|$`3ÿ‰|$09½@  t"H@* H‰AHS  H‰¨  ¿   ‰|$0HƒÁ3Òè6Z Hq) H‰H‹CHcHHÿ>* H‰DHC?* H‰Hé?* H‰C H‹CHcHHö?* H‰DH‹…  H‰C(HS0L‹ÆH‹ËèkP  ‹C4‰ƒè   H^@* H‰ƒğ   ƒÈÿ‰ƒø   ‰ƒü   3À‰ƒ   ˆƒ  H³  WÀFF ‰F0ˆF4E3À3ÒH‹ÎèÀY „ÀtÇF0¾ºşÊH‹@  èåY 3öH‰³H  ÆƒP  H‰³T  f‰³\  @ˆ³^  ‰³`  ‰³d  Çƒh     Çƒl     H‰³p  H‰³x  I‹GH…Àtğÿ@‹|$0I‹H‰ƒp  I‹GH‰ƒx  H‹…(