// Generated code from Butter Knife. Do not modify!
package com.udacity.stockhawk.ui;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity$$ViewBinder<T extends MainActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends MainActivity> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.recyclerView = finder.findRequiredViewAsType(source, 2131624066, "field 'recyclerView'", RecyclerView.class);
      target.fab = finder.findRequiredViewAsType(source, 2131624068, "field 'fab'", FloatingActionButton.class);
      target.swipeRefreshLayout = finder.findRequiredViewAsType(source, 2131624065, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
      target.error = finder.findRequiredViewAsType(source, 2131624067, "field 'error'", TextView.class);
      target.toolbar = finder.findRequiredViewAsType(source, 2131624064, "field 'toolbar'", Toolbar.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.recyclerView = null;
      target.fab = null;
      target.swipeRefreshLayout = null;
      target.error = null;
      target.toolbar = null;

      this.target = null;
    }
  }
}
