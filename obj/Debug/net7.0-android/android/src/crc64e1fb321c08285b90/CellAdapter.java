package crc64e1fb321c08285b90;


public abstract class CellAdapter
	extends android.widget.BaseAdapter
	implements
		mono.android.IGCUserPeer,
		android.widget.AdapterView.OnItemLongClickListener,
		android.view.ActionMode.Callback,
		android.widget.AdapterView.OnItemClickListener,
		androidx.appcompat.view.ActionMode.Callback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemLongClick:(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z:GetOnItemLongClick_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemLongClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActionItemClicked:(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z:GetOnActionItemClicked_Landroid_view_ActionMode_Landroid_view_MenuItem_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onCreateActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z:GetOnCreateActionMode_Landroid_view_ActionMode_Landroid_view_Menu_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onDestroyActionMode:(Landroid/view/ActionMode;)V:GetOnDestroyActionMode_Landroid_view_ActionMode_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onPrepareActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z:GetOnPrepareActionMode_Landroid_view_ActionMode_Landroid_view_Menu_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onItemClick:(Landroid/widget/AdapterView;Landroid/view/View;IJ)V:GetOnItemClick_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onActionItemClicked:(Landroidx/appcompat/view/ActionMode;Landroid/view/MenuItem;)Z:GetOnActionItemClicked_Landroidx_appcompat_view_ActionMode_Landroid_view_MenuItem_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\n" +
			"n_onCreateActionMode:(Landroidx/appcompat/view/ActionMode;Landroid/view/Menu;)Z:GetOnCreateActionMode_Landroidx_appcompat_view_ActionMode_Landroid_view_Menu_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\n" +
			"n_onDestroyActionMode:(Landroidx/appcompat/view/ActionMode;)V:GetOnDestroyActionMode_Landroidx_appcompat_view_ActionMode_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\n" +
			"n_onPrepareActionMode:(Landroidx/appcompat/view/ActionMode;Landroid/view/Menu;)Z:GetOnPrepareActionMode_Landroidx_appcompat_view_ActionMode_Landroid_view_Menu_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Microsoft.Maui.Controls.Handlers.Compatibility.CellAdapter, Microsoft.Maui.Controls", CellAdapter.class, __md_methods);
	}


	public CellAdapter ()
	{
		super ();
		if (getClass () == CellAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.CellAdapter, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public CellAdapter (android.content.Context p0)
	{
		super ();
		if (getClass () == CellAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.CellAdapter, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public boolean onItemLongClick (android.widget.AdapterView p0, android.view.View p1, int p2, long p3)
	{
		return n_onItemLongClick (p0, p1, p2, p3);
	}

	private native boolean n_onItemLongClick (android.widget.AdapterView p0, android.view.View p1, int p2, long p3);


	public boolean onActionItemClicked (andr��   H��H���   �A� �H��tH�CHcHH��H���` �H�M�H�H��H�@@H�\$8H�l$@H�t$HH�� _H�%�� �����H�\$WH��@H�yH H��H��u��e H�CH�C��e H;CHt8H��}A �9P'H�d$0 H�D$0�P3  L� ^+ H�D$ A�Z�g�a ��_ H�{( tVH�H�H���   �y� ��t?H�K8L��H�T$0�����H�3�H�H���   �O� H�K(L�CH��H�H� �8� �vH�H�H���   �#� ��t3H� }A �9F'H�d$0 H�D$0�FG  L�d�+ H�D$ A�C&:z�a H��   H�H���   �Ԯ H�K0H��H�H�@��� H�\$`H��@_��������������H�I H�H� H�%�� ���������������H�\$WH��PH�y@ H��H��t�zd H;G@t8H�g|A �9P'H�d$0 H�D$0�P�  L��\+ H�D$ A�7�k�K` �n^ H�O0H��H�A�x uL�L9@ sH�@�H��H� �x t�z uEH�B H9r<H;�t7H�O0�i(��H��   H�H���   �ͭ H�O(H��H�H�@��� �>H��{A �9(2H�H�D$@H�D$8
  H�D$8�(�  L���+ H�D$ A�X� ��_ H�\$pH��P_�������@SH��PH�yH H��u�ac H�CH�C�Vc H;CHt8H�C{A �9P'H�d$0 H�D$0�P  L�w[+ H�D$ A��V���'_ �J] H�C@H��t;H�{A �9F/H�D$8  H�D$@H�D$8�F$  L���+ H�D$ A�d���^ H�K0H�H�@��� H�S0H�c0 H��tH�BH��HcHH��3] H��P[��H�\$WH�� W�I��H�a H��H�a H�zL�BrH���F��H�H�' H�c( H�c0 H�C H�GH�C(H�GH�C0H��H�g H�g H�\$0H�� _�H�\$VWAVH��0I��I��L��H�L$ H�\$pH�H�a H�a ��X   �� I�FH�H L��H���C���I�FH�0I�FH�pI�NH�q3�I�N�D H��H��|�I��H�\$XH��0A^_^����H��H�XH�pH�x H�HAVH��0I��I��H��L��H���. H�H�a �A�#\ �H���+ I��AFI�~ I�N(H�D$pH�D$(H�D$hH�D$ L�L$`L�ƊT$@�r  �I�V H�BHcHH��H���[ �I��H�\$HH�t$PH�|$XH��0A^����H��H�XH�pH�HWH��0I��H��H�H�H�H�a H�a ��X   �� H�CH�x H�D$`H�W�H�g H�g L�BH�zrH�H����D��H�g  H�g0 H�g( H�g0 H�CH�0H�CH�pH�KH�q3�H�K�D H��H��|�H��H�\$HH�t$PH��0_�H�\$H�t$WH�� �   H���AH�ىAH�}�+ H�M�L�L$0M��tI�AI��HcHI��Z H�H�KL�@ H��H�I#�L�D$0�ku��H�t$@H��H�\$8H�� _�H�\$H�L$WH�� I��H��H�D$X��H�D$PH�H�QH��W�H�a H�a M�AI�yrM�	I���C���H�H�S0H��tH�BHcHH��H���Y �H��H�\$8H�� _�@SUVWAVH��   H��)t$pH�T$0M��I��H����!���@0�D$`H�t$`�~ uH�V H��������uH�3�C�uH��袋.��H9Gt{L�H�L$0L��L�t$ H���~���H�pH�` H�L$8H��tH�� ��  H�L$8H��t
�X   �� L��H�T$PH���t$P��;��H��C(t$pH��H�Ā   A^_^][���c����H�\$ UVWH�� A�x I��H��H��u1L�GH��H�������H��H�?H�K �^  �X   H���a� � t�H�\$XH�� _^]���H�\$UVWH��   H��I��H�T$`H��� ��H�t$p�~ uH�V H��������uH�3�C�   H��袋.��H9G��   L�H�D$0H�D$(L��� H�D$@H�l$@H��H�D$ H�L$P�l���H�pH�` H�L$XH��tH�� �  H�L$XH��t
�X   萫 D$`L��H�T$@H���D$@�}:��H��CH��H��$�   H�Ā   _^]��{