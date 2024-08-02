// Generated by view binder compiler. Do not edit!
package com.example.openinapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.openinapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TopSourceItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ivSourceIcon;

  @NonNull
  public final TextView tvMainSourceText;

  @NonNull
  public final TextView tvMainTextDesc;

  private TopSourceItemBinding(@NonNull CardView rootView, @NonNull ImageView ivSourceIcon,
      @NonNull TextView tvMainSourceText, @NonNull TextView tvMainTextDesc) {
    this.rootView = rootView;
    this.ivSourceIcon = ivSourceIcon;
    this.tvMainSourceText = tvMainSourceText;
    this.tvMainTextDesc = tvMainTextDesc;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static TopSourceItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TopSourceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.top_source_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TopSourceItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivSourceIcon;
      ImageView ivSourceIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivSourceIcon == null) {
        break missingId;
      }

      id = R.id.tvMainSourceText;
      TextView tvMainSourceText = ViewBindings.findChildViewById(rootView, id);
      if (tvMainSourceText == null) {
        break missingId;
      }

      id = R.id.tvMainTextDesc;
      TextView tvMainTextDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvMainTextDesc == null) {
        break missingId;
      }

      return new TopSourceItemBinding((CardView) rootView, ivSourceIcon, tvMainSourceText,
          tvMainTextDesc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
