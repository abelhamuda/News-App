// Generated by view binder compiler. Do not edit!
package com.yozabel.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.yozabel.newsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText etSearchView;

  @NonNull
  public final FrameLayout frameSearch;

  @NonNull
  public final ImageView imageClear;

  @NonNull
  public final LinearLayout linearNews;

  @NonNull
  public final ShimmerRecyclerView rvListNews;

  @NonNull
  public final TextView tvTitle;

  private FragmentSearchBinding(@NonNull ConstraintLayout rootView, @NonNull EditText etSearchView,
      @NonNull FrameLayout frameSearch, @NonNull ImageView imageClear,
      @NonNull LinearLayout linearNews, @NonNull ShimmerRecyclerView rvListNews,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.etSearchView = etSearchView;
    this.frameSearch = frameSearch;
    this.imageClear = imageClear;
    this.linearNews = linearNews;
    this.rvListNews = rvListNews;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etSearchView;
      EditText etSearchView = ViewBindings.findChildViewById(rootView, id);
      if (etSearchView == null) {
        break missingId;
      }

      id = R.id.frameSearch;
      FrameLayout frameSearch = ViewBindings.findChildViewById(rootView, id);
      if (frameSearch == null) {
        break missingId;
      }

      id = R.id.imageClear;
      ImageView imageClear = ViewBindings.findChildViewById(rootView, id);
      if (imageClear == null) {
        break missingId;
      }

      id = R.id.linearNews;
      LinearLayout linearNews = ViewBindings.findChildViewById(rootView, id);
      if (linearNews == null) {
        break missingId;
      }

      id = R.id.rvListNews;
      ShimmerRecyclerView rvListNews = ViewBindings.findChildViewById(rootView, id);
      if (rvListNews == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ConstraintLayout) rootView, etSearchView, frameSearch,
          imageClear, linearNews, rvListNews, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
