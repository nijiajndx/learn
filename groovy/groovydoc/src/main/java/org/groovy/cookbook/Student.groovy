package org.groovy.cookbook

/**
 * Created by sfit0450 on 2014/10/27.
 */
import groovy.transform.ToString

@ToString
class Studentt{
    String name
}

def s = new Studentt(name:'John')
assert s.toString() == 'Studentt(John)'
//println s.toString()