package com.leezhengqingoutlook.contacts;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李正庆 on 2017/12/10.
 */

public class GetNumber {
    public static List<PhoneInfo> list=new ArrayList<PhoneInfo>();
    public static String getNumber(Context context)
    {
        Cursor cursor=context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
        String phoneNumber;
        String phoneName;
        while(cursor.moveToNext())
        {
            phoneNumber=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            phoneName=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            PhoneInfo phoneInfo=new PhoneInfo(phoneName,phoneNumber);
            list.add(phoneInfo);
        }
        return null;
    }

}
