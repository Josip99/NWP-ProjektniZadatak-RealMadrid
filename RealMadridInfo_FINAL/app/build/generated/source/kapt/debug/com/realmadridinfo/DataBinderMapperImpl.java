package com.realmadridinfo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.realmadridinfo.databinding.ActivityMainBindingImpl;
import com.realmadridinfo.databinding.ActivityUserAuthBindingImpl;
import com.realmadridinfo.databinding.FragmentHomeBindingImpl;
import com.realmadridinfo.databinding.FragmentLoginBindingImpl;
import com.realmadridinfo.databinding.FragmentPlayerDetailsBindingImpl;
import com.realmadridinfo.databinding.FragmentPlayersBindingImpl;
import com.realmadridinfo.databinding.FragmentRegisterBindingImpl;
import com.realmadridinfo.databinding.RvItemEventBindingImpl;
import com.realmadridinfo.databinding.RvItemPlayerBindingImpl;
import com.realmadridinfo.databinding.RvItemStandingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYUSERAUTH = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTLOGIN = 4;

  private static final int LAYOUT_FRAGMENTPLAYERDETAILS = 5;

  private static final int LAYOUT_FRAGMENTPLAYERS = 6;

  private static final int LAYOUT_FRAGMENTREGISTER = 7;

  private static final int LAYOUT_RVITEMEVENT = 8;

  private static final int LAYOUT_RVITEMPLAYER = 9;

  private static final int LAYOUT_RVITEMSTANDING = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.activity_user_auth, LAYOUT_ACTIVITYUSERAUTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.fragment_player_details, LAYOUT_FRAGMENTPLAYERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.fragment_players, LAYOUT_FRAGMENTPLAYERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.rv_item_event, LAYOUT_RVITEMEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.rv_item_player, LAYOUT_RVITEMPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.realmadridinfo.R.layout.rv_item_standing, LAYOUT_RVITEMSTANDING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSERAUTH: {
          if ("layout/activity_user_auth_0".equals(tag)) {
            return new ActivityUserAuthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user_auth is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYERDETAILS: {
          if ("layout/fragment_player_details_0".equals(tag)) {
            return new FragmentPlayerDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_player_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYERS: {
          if ("layout/fragment_players_0".equals(tag)) {
            return new FragmentPlayersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_players is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_RVITEMEVENT: {
          if ("layout/rv_item_event_0".equals(tag)) {
            return new RvItemEventBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rv_item_event is invalid. Received: " + tag);
        }
        case  LAYOUT_RVITEMPLAYER: {
          if ("layout/rv_item_player_0".equals(tag)) {
            return new RvItemPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rv_item_player is invalid. Received: " + tag);
        }
        case  LAYOUT_RVITEMSTANDING: {
          if ("layout/rv_item_standing_0".equals(tag)) {
            return new RvItemStandingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rv_item_standing is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "event");
      sKeys.put(2, "player");
      sKeys.put(3, "standing");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_main_0", com.realmadridinfo.R.layout.activity_main);
      sKeys.put("layout/activity_user_auth_0", com.realmadridinfo.R.layout.activity_user_auth);
      sKeys.put("layout/fragment_home_0", com.realmadridinfo.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", com.realmadridinfo.R.layout.fragment_login);
      sKeys.put("layout/fragment_player_details_0", com.realmadridinfo.R.layout.fragment_player_details);
      sKeys.put("layout/fragment_players_0", com.realmadridinfo.R.layout.fragment_players);
      sKeys.put("layout/fragment_register_0", com.realmadridinfo.R.layout.fragment_register);
      sKeys.put("layout/rv_item_event_0", com.realmadridinfo.R.layout.rv_item_event);
      sKeys.put("layout/rv_item_player_0", com.realmadridinfo.R.layout.rv_item_player);
      sKeys.put("layout/rv_item_standing_0", com.realmadridinfo.R.layout.rv_item_standing);
    }
  }
}
