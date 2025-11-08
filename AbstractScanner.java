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
        //some more change done from github now
		return scanner.index();
	}

	@Override
	public List<Map.Entry<String, String>> scan(final ClassFile cls) {
		return scanner.scan(cls);
	}
}
