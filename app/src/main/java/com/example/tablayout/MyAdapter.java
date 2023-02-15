package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayout.fragments.CallsFragment;
import com.example.tablayout.fragments.ChatsFragment;
import com.example.tablayout.fragments.CommunitiesFragment;
import com.example.tablayout.fragments.SettingsFragment;
import com.example.tablayout.fragments.StatusFragment;

public class MyAdapter extends FragmentStateAdapter {
    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 0:
                return new CallsFragment();
            case 1:
                return new ChatsFragment();
            case 2:
                return new StatusFragment();
            case 3:
                return new CommunitiesFragment();
            case 4:
                return new SettingsFragment();
            default:
                return new CallsFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
