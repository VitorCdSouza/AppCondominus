package crc640ec207abc449b2ca;


public class ShellSearchView
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer,
		android.widget.TextView.OnEditorActionListener,
		android.text.TextWatcher,
		android.text.NoCopySpan
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onEditorAction:(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z:GetOnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_Handler:Android.Widget.TextView/IOnEditorActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_afterTextChanged:(Landroid/text/Editable;)V:GetAfterTextChanged_Landroid_text_Editable_Handler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_beforeTextChanged:(Ljava/lang/CharSequence;III)V:GetBeforeTextChanged_Ljava_lang_CharSequence_IIIHandler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onTextChanged:(Ljava/lang/CharSequence;III)V:GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSearchView, Microsoft.Maui.Controls", ShellSearchView.class, __md_methods);
	}


	public ShellSearchView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ShellSearchView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSearchView, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public ShellSearchView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ShellSearchView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSearchView, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public ShellSearchView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ShellSearchView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSearchView, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public ShellSearchView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == ShellSearchView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSearchView, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public boolean onEditorAction (android.widget.TextView p0, int p1, android.view.KeyEvent p2)
	{
		return n_onEditorAction (p0, p1, p2);
	}

	private native boolean n_onEditorAction (android.widget.TextView p0, int p1, android.view.KeyEvent p2);


	public void E�H�GH�E�H��E��M�EH�~rH�H�E�H�FH�E�E�H�E��� �E/H��D H�E�L��. H�D$ �(� A�RNDf�� H��H  H����,��H��X   ��   �   H����  H�H��H�@(��/ H��H�xrH�H�@H�E�H�H�M�H��H�@ ��/ H��H�xrH�H�@H�E�H�M�H�KpH�H���   �_/ (E�L�E�(M�H�U�H��fE�fM������W�L�E�3�H���E��[���H��$�   H�Ġ   _^]�H�\$H�t$UWAVH�l$�H���   H�C�? H3�H�E?���   H��H����  �Ql�B�����  Ɓ�   H���D �8(��   H�M'�r  H�H��H�A(H����. ��. H���E�H�xrH�H�@H�E�H�M�E��E�H�E���7�. �M��E��M�H�F�D H�E�L���. H�D$ �(� A��+���6� �{l��   H���   H�U7A�	   ����H���D �8(��   �SlH�M'�  H�H��D�u7H�A(H����- ĺ. H���E�H�xrH�H�@H�E�����H�M�E�D�u��E�H�E�f�. �M��E��EH�u�D H�E�L�j�. H�D$ �(� A��+��e� H�U7H���   E3��*���H�M?H3���2 L��$�   I�[(I�s0I��A^_]���������������H��H�XH�pH�x UATAUAVAWH�h�H��   H�.�? H3�H�EH��E3�E�