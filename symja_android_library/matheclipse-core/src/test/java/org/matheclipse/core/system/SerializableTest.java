package org.matheclipse.core.system;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IExpr;

import junit.framework.TestCase;

public class SerializableTest extends TestCase {

	public void testNum() {
		equalsCopy(F.num(0.5));
		equalsCopy(F.num(Integer.MAX_VALUE));
	}

	public void testComplexNum() {
		equalsCopy(F.complexNum(0.5));
		equalsCopy(F.complexNum(Integer.MAX_VALUE));
		equalsCopy(F.complexNum(0.5, 0.5));
		equalsCopy(F.complexNum(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}

	public void testInteger() {
		equalsCopy(F.integer(Integer.MAX_VALUE));
		equalsCopy(F.integer(Integer.MIN_VALUE));
		equalsCopy(F.integer(Integer.MAX_VALUE * 2));
		equalsCopy(F.integer(Integer.MIN_VALUE * 2));
	}

	public void testFraction() {
		equalsCopy(F.fraction(1L, Integer.MAX_VALUE));
		equalsCopy(F.fraction(1L, Integer.MIN_VALUE));
		equalsCopy(F.fraction(1L, Integer.MAX_VALUE * 2L));
		equalsCopy(F.fraction(1L, Integer.MIN_VALUE * 2L));
		equalsCopy(F.fraction(Integer.MAX_VALUE, 7L));
		equalsCopy(F.fraction(Integer.MIN_VALUE, 3L));
		equalsCopy(F.fraction(Integer.MAX_VALUE * 2L, 5L));
		equalsCopy(F.fraction(Integer.MIN_VALUE * 2L, 11L));
	}

	public void testComplex() {
		equalsCopy(F.complex(F.fraction(1L, Integer.MAX_VALUE)));
		equalsCopy(F.complex(F.fraction(1L, Integer.MIN_VALUE)));
		equalsCopy(F.complex(F.fraction(1L, Integer.MAX_VALUE * 2L)));
		equalsCopy(F.complex(F.fraction(1L, Integer.MIN_VALUE * 2L)));
		equalsCopy(F.complex(F.fraction(Integer.MAX_VALUE, 7L)));
		equalsCopy(F.complex(F.fraction(Integer.MIN_VALUE, 3L)));
		equalsCopy(F.complex(F.fraction(Integer.MAX_VALUE * 2L, 5L)));
		equalsCopy(F.complex(F.fraction(Integer.MIN_VALUE * 2L, 11L)));

		equalsCopy(F.complex(F.fraction(1L, Integer.MAX_VALUE), F.fraction(1L, Integer.MAX_VALUE)));
		equalsCopy(F.complex(F.fraction(1L, Integer.MIN_VALUE), F.fraction(1L, Integer.MIN_VALUE)));
		equalsCopy(F.complex(F.fraction(1L, Integer.MAX_VALUE * 2L), F.fraction(1L, Integer.MAX_VALUE * 2L)));
		equalsCopy(F.complex(F.fraction(1L, Integer.MIN_VALUE * 2L), F.fraction(1L, Integer.MAX_VALUE * 2L)));
		equalsCopy(F.complex(F.fraction(Integer.MAX_VALUE, 7L), F.fraction(Integer.MAX_VALUE, 7L)));
		equalsCopy(F.complex(F.fraction(Integer.MIN_VALUE, 3L), F.fraction(Integer.MIN_VALUE, 3L)));
		equalsCopy(F.complex(F.fraction(Integer.MAX_VALUE * 2L, 5L), F.fraction(Integer.MAX_VALUE * 2L, 5L)));
		equalsCopy(F.complex(F.fraction(Integer.MIN_VALUE * 2L, 11L), F.fraction(Integer.MIN_VALUE * 2L, 11L)));
	}

	public void testSymbol() {
		equalsCopy(F.Pi);
		equalsCopy(F.$s("testme"));
	}

	public void testStringX() {
		equalsCopy(F.stringx("test"));
	}

	public void testFunction() {
		equalsCopy(F.Sin(F.Times(F.C1D2, F.Pi)));
		equalsCopy(F.Continue());
		equalsCopy(F.If(F.True, F.Plus(F.Infinity, F.Pi), F.False));
		equalsCopy(F.Log(F.x, F.y));
		equalsCopy(F.ast(F.$s("fun1")));
		equalsCopy(F.ast(new IExpr[] { F.x, F.y }, F.$s("fun2")));
	}

	public void testBlank() {
		equalsCopy(F.$b(null));
		equalsCopy(F.$b(F.IntegerQ));
	}

	public void testPattern() {
		equalsCopy(F.$p("test", true));
		equalsCopy(F.$p("test", false));
		equalsCopy(F.$p(F.x));
	}

	public void testPatternSequence() {
		equalsCopy(F.$ps("test"));
		equalsCopy(F.$ps(F.x, F.IntegerQ));
		equalsCopy(F.$ps(F.x, F.IntegerQ, true, true));
		equalsCopy(F.$ps(F.x, F.IntegerQ, true, false));
	}

	// public void testIntegrateDefinition() {
	// equalsCopy(F.Integrate.getRulesData());
	// }

	public void testSinDefinition() {
		equalsCopy(F.Sin.getRulesData());
	}

	public void testNIL() {
		equalsCopy(F.NIL);
	}

	private void equalsCopy(Object original) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(original);
			byte[] bArray = baos.toByteArray();
			baos.close();
			oos.close();
			ByteArrayInputStream bais = new ByteArrayInputStream(bArray);
			ObjectInputStream ois = new ObjectInputStream(bais);
			Object copy = ois.readObject();
			bais.close();
			ois.close();
			// System.out.println(copy.toString());
			assertEquals(original, copy);

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			assertEquals("", cnfe.toString());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			assertEquals("", ioe.toString());
		}
	}
}