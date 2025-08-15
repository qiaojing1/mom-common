package com.lets.platform.common.pojo.base;

import java.lang.reflect.Method;

/**
 * @Author: qiao jing
 * @Date: 2020/6/6 15:47
 */
public class ComparableAtomMethod implements Comparable<ComparableAtomMethod> {

    private Method atomAction;
    private int atomIndex;

    public ComparableAtomMethod(Method atomAction, int atomIndex) {
        this.atomAction = atomAction;
        this.atomIndex = atomIndex;
    }

    public Object getAtomAction() {
        return atomAction;
    }

    public void setAtomAction(Method atomAction) {
        this.atomAction = atomAction;
    }

    public int getAtomIndex() {
        return atomIndex;
    }

    public void setAtomIndex(int atomIndex) {
        this.atomIndex = atomIndex;
    }

    @Override
    public int compareTo(ComparableAtomMethod o) {
        int i = 0;
        if(this.getAtomIndex()<o.getAtomIndex()){
            return -1;
        }else if(this.getAtomIndex()>o.getAtomIndex()){
            return 1;
        }
        return 0;
    }
}
