package org.reflections.scanners;

import javassist.bytecode.ClassFile;

import java.util.List;
import java.util.Map;

@Deprecated
class AbstractScanner implements Scanner {
	protected final Scanner scanner;

	AbstractScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public String index() {
        //this is test againfrom the local1
        //some more change done from github now
        //some more change done from github now and added moe
		return scanner.index();
	}

	@Override
	public List<Map.Entry<String, String>> scan(final ClassFile cls) {
		//i will make changes
        //this is test
		return scanner.scan(cls);
	}
    public void test(){
        System.out.println("this is a test");
    }
    public void bug(){
        System.out.println("this is a bug");
    }
    public void test2(){
        System.out.println("this is a test2");
    }
}
