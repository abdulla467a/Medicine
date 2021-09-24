package com.shaykat.medicinetime.alarm;

import com.shaykat.medicinetime.BasePresenter;
import com.shaykat.medicinetime.BaseView;
import com.shaykat.medicinetime.data.source.History;
import com.shaykat.medicinetime.data.source.MedicineAlarm;

/**
 * Created by gautam on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
