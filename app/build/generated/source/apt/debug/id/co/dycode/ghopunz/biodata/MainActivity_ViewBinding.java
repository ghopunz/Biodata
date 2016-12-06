// Generated code from Butter Knife. Do not modify!
package id.co.dycode.ghopunz.biodata;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131427438;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.labelName = Utils.findRequiredViewAsType(source, R.id.label_name, "field 'labelName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.edit_profile, "field 'editProfile' and method 'onClick'");
    target.editProfile = Utils.castView(view, R.id.edit_profile, "field 'editProfile'", Button.class);
    view2131427438 = view;
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

    target.labelName = null;
    target.editProfile = null;

    view2131427438.setOnClickListener(null);
    view2131427438 = null;

    this.target = null;
  }
}
