package chap_16;

public class _02_Access_Class {
    // public class는 다른패키지, 같은 패키지에서 모두 사용가능
    PublicClass publicClass = new PublicClass();
    // default class는 같은 패키지에서만 사용 가능
    DefaultClass defaultClass = new DefaultClass();
}
