// Generated code from Butter Knife. Do not modify!
package com.udacity.stockhawk.ui;

import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class AddStockDialog$$ViewBinder<T extends AddStockDialog> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends AddStockDialog> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.stock = finder.findRequiredViewAsType(source, 2131624069, "field 'stock'", EditText.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.stock = null;

      this.target = null;
    }
  }
}
