// Generated by data binding compiler. Do not edit!
package com.realmadridinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.realmadridinfo.R;
import com.realmadridinfo.data.models.Player;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RvItemPlayerBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivItemImage;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPrice;

  @Bindable
  protected Player mPlayer;

  protected RvItemPlayerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivItemImage, TextView tvName, TextView tvPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivItemImage = ivItemImage;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
  }

  public abstract void setPlayer(@Nullable Player player);

  @Nullable
  public Player getPlayer() {
    return mPlayer;
  }

  @NonNull
  public static RvItemPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.rv_item_player, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RvItemPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RvItemPlayerBinding>inflateInternal(inflater, R.layout.rv_item_player, root, attachToRoot, component);
  }

  @NonNull
  public static RvItemPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.rv_item_player, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RvItemPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RvItemPlayerBinding>inflateInternal(inflater, R.layout.rv_item_player, null, false, component);
  }

  public static RvItemPlayerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RvItemPlayerBinding bind(@NonNull View view, @Nullable Object component) {
    return (RvItemPlayerBinding)bind(component, view, R.layout.rv_item_player);
  }
}
