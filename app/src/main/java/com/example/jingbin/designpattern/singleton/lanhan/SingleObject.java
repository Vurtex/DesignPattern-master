package com.example.jingbin.designpattern.singleton.lanhan;

/**
 * @author Vurtex QQ:616288668
 *         create at 2018/2/27 13:14
 */
public class SingleObject {

    private static SingleObject mSingleObject;
    private static SingleObject mSingleObject2;
    private static SingleObject mSingleObject3;
    private static SingleObject mSingleObject4;

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        if (mSingleObject == null) mSingleObject = new SingleObject();
        return mSingleObject;
    }

    public static synchronized SingleObject getmSingleObject() {
        if (mSingleObject2 == null) {
            mSingleObject2 = new SingleObject();
        }
        return mSingleObject2;
    }

    public static SingleObject getmSingleObject3() {
        if (mSingleObject3 == null) {
            synchronized (SingleObject.class) {
                mSingleObject3 = new SingleObject();
            }
        }
        return mSingleObject3;
    }

    public static SingleObject getmSingleObject4() {
        if (mSingleObject4 == null) {
            synchronized (SingleObject.class) {
                if (mSingleObject4 == null) {
                    mSingleObject4 = new SingleObject();
                }
            }
        }
        return mSingleObject4;
    }
}
