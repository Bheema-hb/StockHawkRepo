// Generated code from Butter Knife. Do not modify!
package com.udacity.stockhawk.ui;

import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import com.github.mikephil.charting.charts.LineChart;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class StockDetails$$ViewBinder<T extends StockDetails> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends StockDetails> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.lineChart = finder.findRequiredViewAsType(source, 2131624054, "field 'lineChart'", LineChart.class);
      target.toolbar = finder.findRequiredViewAsType(source, 2131624053, "field 'toolbar'", Toolbar.class);
      target.linearLayout = finder.findRequiredViewAsType(source, 2131624052, "field 'linearLayout'", LinearLayout.class);
      target.cu = finder.findRequiredViewAsType(source, 2131624057, "field 'cu'", TextView.class);
      target.ss = finder.findRequiredViewAsType(source, 2131624056, "field 'ss'", TextView.class);
      target.yh = finder.findRequiredViewAsType(source, 2131624062, "field 'yh'", TextView.class);
      target.yl = finder.findRequiredViewAsType(source, 2131624061, "field 'yl'", TextView.class);
      target.dl = finder.findRequiredViewAsType(source, 2131624059, "field 'dl'", TextView.class);
      target.dh = finder.findRequiredViewAsType(source, 2131624060, "field 'dh'", TextView.class);
      target.sn = finder.findRequiredViewAsType(source, 2131624055, "field 'sn'", TextView.class);
      target.ltd = finder.findRequiredViewAsType(source, 2131624058, "field 'ltd'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.lineChart = null;
      target.toolbar = null;
      target.linearLayout = null;
      target.cu = null;
      target.ss = null;
      target.yh = null;
      target.yl = null;
      target.dl = null;
      target.dh = null;
      target.sn = null;
      target.ltd = null;

      this.target = null;
    }
  }
}
