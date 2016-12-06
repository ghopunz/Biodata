// Generated code from Butter Knife. Do not modify!
package id.co.dycode.ghopunz.biodata;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EditProfileActivity_ViewBinding<T extends EditProfileActivity> implements Unbinder {
  protected T target;

  private View view2131427422;

  @UiThread
  public EditProfileActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.editText = Utils.findRequiredViewAsType(source, R.id.editText, "field 'editText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_edit_ok, "field 'btnEditOk' and method 'onClick'");
    target.btnEditOk = Utils.castView(view, R.id.btn_edit_ok, "field 'btnEditOk'", Button.class);
    view2131427422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.editText = null;
    target.btnEditOk = null;

    view2131427422.setOnClickListener(null);
    view2131427422 = null;

    this.target = null;
  }
}
