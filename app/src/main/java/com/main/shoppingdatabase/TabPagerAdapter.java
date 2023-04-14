package com.main.shoppingdatabase;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.main.shoppingdatabase.fragments.addNewFragment;
import com.main.shoppingdatabase.fragments.infoFragment;
import com.main.shoppingdatabase.fragments.mainFragment;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new mainFragment();
            case 1:
                return new addNewFragment();
            case 2:
                return new addNewFragment();
            case 3:
                return new infoFragment();
            default:
                return new mainFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
