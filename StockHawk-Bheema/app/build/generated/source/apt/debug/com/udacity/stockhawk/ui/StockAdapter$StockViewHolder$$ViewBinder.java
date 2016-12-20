// Generated code from Butter Knife. Do not modify!
package com.udacity.stockhawk.ui;

import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class StockAdapter$StockViewHolder$$ViewBinder<T extends StockAdapter.StockViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends StockAdapter.StockViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.symbol = finder.findRequiredViewAsType(source, 2131624083, "field 'symbol'", TextView.class);
      target.price = finder.findRequiredViewAsType(source, 2131624084, "field 'price'", TextView.class);
      target.change = finder.findRequiredViewAsType(source, 2131624085, "field 'change'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.symbol = null;
      target.price = null;
      target.change = null;

      this.target = null;
    }
  }
}
