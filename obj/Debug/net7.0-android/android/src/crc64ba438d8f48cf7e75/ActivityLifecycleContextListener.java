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


	public void onActivityPostSaveInstanceState (android.apU�E3�D�d$ W�L�bH�B   D�"�D$    W��M L�e0H�y@H�}�H����2���M�}0I�E8I�H�D$0���L;���  I�M(H��I#�I�E L�$�W�3�E8EHH�EX.:* �E�H�U�H�M8�\,���H�u@H��t��FH�u@H�E8H�E�H�u�H�x I�T$H�L$p����H��A�$H�M I�E �v� L��L��H�UH���D���H�U�H��r2H��H�L$pH��H��   rH��'H�I�H+�H���H����  蟳 3�H�}�H�E�   @�|$pH��t8�������F�u*H�H��H� �� ����F�uH�H��H�@�׮ I9|$ t8I�L$I�|$(rI�L$I�D$ H�L$`H�D$h(D$`fE�H�U�H�MH�Hw��H�U8H�M �[���H�]@���H��t5����C�u*H�H��H� �d� ����C�uH�H��H�@�I� I��L;|$0�C���I�}@H�E(H9E ��  3�D�B@H�M`�f� s8* �E�H�U�H�M`�+���H�KY�8��m4I�mH��H��H��?H�H�L$@�r���D$    H�D$@H�|$XHCD$@H�D$0H�D$PH�D$8(D$0fE�H�U�H�Mp�Kv���H�T$XH��r<H��H�L$@H��H��   r#H��'H�I�H+�H���H��v�� ��� ��˱ H�U H���   �?`��H�]hH��t��CH�]hH�M`H�M�H�]�I����C���H��t6����C�u+H�H��H� ��� ����C�uH�H��H�@�� �H�]hH��t6����C�u+H�H��H� ��� ����C�uH�H��H�@��� �H����.���H�M �Yg��I��H���   H3��� H��$   H�İ  A_A^A]A\_^]�����H�\$WH�� H��H��H�! H�a H�T$0�   �t� H�D$0H��tW� �   �H�HH��M* H�H�xH�;H�C�   3��t� H��H�\$8H�� _���H�\$ UVWH�� A�x I��H��H��u1L�GH��H�������H��H�?H�K �2
  ��   H���� � t�H�\$XH�� _^]���H�\$ UVWH�� A�x I��H��H��u1L�GH��H�������H��H�?H�K �>
  �P   H����� � t�H�\$XH�� _^]���H�\$H�t$WH��@I��H���0   �] H��H�D$ H��t%�D$0L��H�T$0H���G2��H�M* H��3�H��H�\$PH�t$XH��@_���H�\$H�l$H�L$VWAVH��@I��M��H��H����   �ۮ H��H�D$`H��tVW� �   �C�CH�bL* H�H�KI�H�P H��M�L#�H��$�   H�D$(H��$�   H�D$ L��H���B�  �3�W�H�CH�H�_H��H�\$hH�l$pH��@A^_^����H�\$H�t$H�L$WH��0H��H���(   �(� H��H�D$@H��t)W� �   �C�CH��K* H�H�KH��(�  �3�W�H�CH�H�_H��H�\$HH�t$PH��0_�@USVWATAUAVAWH��$X���H��  H��#: H3�H���   M��M��L��H��H�L$XH��  H�D$HH��   H��0  H�D$@H�E8L��8  L�|$`3��|$09�@  t"H��@* H�AH�S� H���  �   �|$0H��3��6Z H�q) H�H�CHcHH��>* H�DH�C?* H�H��?* H�C H�CHcHH��?* H�DH��  H�C(H�S0L��H���kP  ��C4���   H�^@* H���   ������   ���   3���   ��  H��  W�FF �F0�F4E3�3�H����Y ��t�F0����H��@  ��Y �3�H��H  ƃP  H��T  f��\  @��^  ��`  ��d  ǃh     ǃl     H��p  H��x  I�GH��t��@�|$0I�H��p  I�GH��x  H��(