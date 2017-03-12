package org.matheclipse.core.builtin;

import static org.matheclipse.core.expression.F.*;

public final class FunctionDefinitions {
	static {
		Abs.setEvaluator(new org.matheclipse.core.reflection.system.Abs());
		AbsArg.setEvaluator(new org.matheclipse.core.reflection.system.AbsArg());
		ArcCos.setEvaluator(new org.matheclipse.core.reflection.system.ArcCos());
		ArcCosh.setEvaluator(new org.matheclipse.core.reflection.system.ArcCosh());
		ArcCot.setEvaluator(new org.matheclipse.core.reflection.system.ArcCot());
		ArcCoth.setEvaluator(new org.matheclipse.core.reflection.system.ArcCoth());
		ArcCsc.setEvaluator(new org.matheclipse.core.reflection.system.ArcCsc());
		ArcCsch.setEvaluator(new org.matheclipse.core.reflection.system.ArcCsch());
		ArcSec.setEvaluator(new org.matheclipse.core.reflection.system.ArcSec());
		ArcSech.setEvaluator(new org.matheclipse.core.reflection.system.ArcSech());
		ArcSin.setEvaluator(new org.matheclipse.core.reflection.system.ArcSin());
		ArcSinh.setEvaluator(new org.matheclipse.core.reflection.system.ArcSinh());
		ArcTan.setEvaluator(new org.matheclipse.core.reflection.system.ArcTan());
		ArcTanh.setEvaluator(new org.matheclipse.core.reflection.system.ArcTanh());
		Arg.setEvaluator(new org.matheclipse.core.reflection.system.Arg());
		ArrayDepth.setEvaluator(new org.matheclipse.core.reflection.system.ArrayDepth());
		BesselJ.setEvaluator(new org.matheclipse.core.reflection.system.BesselJ());
		CartesianProduct.setEvaluator(new org.matheclipse.core.reflection.system.CartesianProduct());
		Catenate.setEvaluator(new org.matheclipse.core.reflection.system.Catenate());
		CDF.setEvaluator(new org.matheclipse.core.reflection.system.CDF());
		Ceiling.setEvaluator(new org.matheclipse.core.reflection.system.Ceiling());
		CentralMoment.setEvaluator(new org.matheclipse.core.reflection.system.CentralMoment());
		ChebyshevT.setEvaluator(new org.matheclipse.core.reflection.system.ChebyshevT());
		ChebyshevU.setEvaluator(new org.matheclipse.core.reflection.system.ChebyshevU());
		ChessboardDistance.setEvaluator(new org.matheclipse.core.reflection.system.ChessboardDistance());
		Coefficient.setEvaluator(new org.matheclipse.core.reflection.system.Coefficient());
		CoefficientList.setEvaluator(new org.matheclipse.core.reflection.system.CoefficientList());
		CoefficientRules.setEvaluator(new org.matheclipse.core.reflection.system.CoefficientRules());
		Commonest.setEvaluator(new org.matheclipse.core.reflection.system.Commonest());
		Complement.setEvaluator(new org.matheclipse.core.reflection.system.Complement());
		ComplexExpand.setEvaluator(new org.matheclipse.core.reflection.system.ComplexExpand());
		ComposeList.setEvaluator(new org.matheclipse.core.reflection.system.ComposeList());
		Conjugate.setEvaluator(new org.matheclipse.core.reflection.system.Conjugate());
		ConstantArray.setEvaluator(new org.matheclipse.core.reflection.system.ConstantArray());
		ContinuedFraction.setEvaluator(new org.matheclipse.core.reflection.system.ContinuedFraction());
		Cos.setEvaluator(new org.matheclipse.core.reflection.system.Cos());
		Cosh.setEvaluator(new org.matheclipse.core.reflection.system.Cosh());
		CosineDistance.setEvaluator(new org.matheclipse.core.reflection.system.CosineDistance());
		CosIntegral.setEvaluator(new org.matheclipse.core.reflection.system.CosIntegral());
		Cot.setEvaluator(new org.matheclipse.core.reflection.system.Cot());
		Coth.setEvaluator(new org.matheclipse.core.reflection.system.Coth());
		Covariance.setEvaluator(new org.matheclipse.core.reflection.system.Covariance());
		Csc.setEvaluator(new org.matheclipse.core.reflection.system.Csc());
		Csch.setEvaluator(new org.matheclipse.core.reflection.system.Csch());
		Curl.setEvaluator(new org.matheclipse.core.reflection.system.Curl());
		D.setEvaluator(new org.matheclipse.core.reflection.system.D());
		Default.setEvaluator(new org.matheclipse.core.reflection.system.Default());
		DeleteDuplicates.setEvaluator(new org.matheclipse.core.reflection.system.DeleteDuplicates());
		Derivative.setEvaluator(new org.matheclipse.core.reflection.system.Derivative());
		DiceDissimilarity.setEvaluator(new org.matheclipse.core.reflection.system.DiceDissimilarity());
		Discriminant.setEvaluator(new org.matheclipse.core.reflection.system.Discriminant());
		Distribute.setEvaluator(new org.matheclipse.core.reflection.system.Distribute());
		Divergence.setEvaluator(new org.matheclipse.core.reflection.system.Divergence());
		Dot.setEvaluator(new org.matheclipse.core.reflection.system.Dot());
		DSolve.setEvaluator(new org.matheclipse.core.reflection.system.DSolve());
		EasterSunday.setEvaluator(new org.matheclipse.core.reflection.system.EasterSunday());
		ElementData.setEvaluator(new org.matheclipse.core.reflection.system.ElementData());
		Eliminate.setEvaluator(new org.matheclipse.core.reflection.system.Eliminate());
		EllipticE.setEvaluator(new org.matheclipse.core.reflection.system.EllipticE());
		EllipticPi.setEvaluator(new org.matheclipse.core.reflection.system.EllipticPi());
		Equal.setEvaluator(new org.matheclipse.core.reflection.system.Equal());
		Equivalent.setEvaluator(new org.matheclipse.core.reflection.system.Equivalent());
		Erf.setEvaluator(new org.matheclipse.core.reflection.system.Erf());
		EuclidianDistance.setEvaluator(new org.matheclipse.core.reflection.system.EuclidianDistance());
		Exp.setEvaluator(new org.matheclipse.core.reflection.system.Exp());
		Export.setEvaluator(new org.matheclipse.core.reflection.system.Export());
		ExtendedGCD.setEvaluator(new org.matheclipse.core.reflection.system.ExtendedGCD());
		Extract.setEvaluator(new org.matheclipse.core.reflection.system.Extract());
		FindInstance.setEvaluator(new org.matheclipse.core.reflection.system.FindInstance());
		FindRoot.setEvaluator(new org.matheclipse.core.reflection.system.FindRoot());
		Fit.setEvaluator(new org.matheclipse.core.reflection.system.Fit());
		Floor.setEvaluator(new org.matheclipse.core.reflection.system.Floor());
		FractionalPart.setEvaluator(new org.matheclipse.core.reflection.system.FractionalPart());
		FresnelC.setEvaluator(new org.matheclipse.core.reflection.system.FresnelC());
		FresnelS.setEvaluator(new org.matheclipse.core.reflection.system.FresnelS());
		FrobeniusSolve.setEvaluator(new org.matheclipse.core.reflection.system.FrobeniusSolve());
		FromCharacterCode.setEvaluator(new org.matheclipse.core.reflection.system.FromCharacterCode());
		FromContinuedFraction.setEvaluator(new org.matheclipse.core.reflection.system.FromContinuedFraction());
		FromPolarCoordinates.setEvaluator(new org.matheclipse.core.reflection.system.FromPolarCoordinates());
		Gamma.setEvaluator(new org.matheclipse.core.reflection.system.Gamma());
		Gather.setEvaluator(new org.matheclipse.core.reflection.system.Gather());
		GCD.setEvaluator(new org.matheclipse.core.reflection.system.GCD());
		GeometricMean.setEvaluator(new org.matheclipse.core.reflection.system.GeometricMean());
		Greater.setEvaluator(new org.matheclipse.core.reflection.system.Greater());
		GreaterEqual.setEvaluator(new org.matheclipse.core.reflection.system.GreaterEqual());
		GroebnerBasis.setEvaluator(new org.matheclipse.core.reflection.system.GroebnerBasis());
		HarmonicNumber.setEvaluator(new org.matheclipse.core.reflection.system.HarmonicNumber());
		Haversine.setEvaluator(new org.matheclipse.core.reflection.system.Haversine());
		HeavisideTheta.setEvaluator(new org.matheclipse.core.reflection.system.HeavisideTheta());
		HermiteH.setEvaluator(new org.matheclipse.core.reflection.system.HermiteH());
		Horner.setEvaluator(new org.matheclipse.core.reflection.system.Horner());
		HornerForm.setEvaluator(new org.matheclipse.core.reflection.system.HornerForm());
		Hypergeometric1F1.setEvaluator(new org.matheclipse.core.reflection.system.Hypergeometric1F1());
		Hypergeometric2F1.setEvaluator(new org.matheclipse.core.reflection.system.Hypergeometric2F1());
		Im.setEvaluator(new org.matheclipse.core.reflection.system.Im());
		Import.setEvaluator(new org.matheclipse.core.reflection.system.Import());
		IntegerExponent.setEvaluator(new org.matheclipse.core.reflection.system.IntegerExponent());
		IntegerPart.setEvaluator(new org.matheclipse.core.reflection.system.IntegerPart());
		IntegerPartitions.setEvaluator(new org.matheclipse.core.reflection.system.IntegerPartitions());
		InterpolatingFunction.setEvaluator(new org.matheclipse.core.reflection.system.InterpolatingFunction());
		InterpolatingPolynomial.setEvaluator(new org.matheclipse.core.reflection.system.InterpolatingPolynomial());
		Interpolation.setEvaluator(new org.matheclipse.core.reflection.system.Interpolation());
		Intersection.setEvaluator(new org.matheclipse.core.reflection.system.Intersection());
		Interval.setEvaluator(new org.matheclipse.core.reflection.system.Interval());
		Inverse.setEvaluator(new org.matheclipse.core.reflection.system.Inverse());
		InverseErf.setEvaluator(new org.matheclipse.core.reflection.system.InverseErf());
		InverseErfc.setEvaluator(new org.matheclipse.core.reflection.system.InverseErfc());
		InverseFunction.setEvaluator(new org.matheclipse.core.reflection.system.InverseFunction());
		InverseHaversine.setEvaluator(new org.matheclipse.core.reflection.system.InverseHaversine());
		JaccardDissimilarity.setEvaluator(new org.matheclipse.core.reflection.system.JaccardDissimilarity());
		Join.setEvaluator(new org.matheclipse.core.reflection.system.Join());
		KOrderlessPartitions.setEvaluator(new org.matheclipse.core.reflection.system.KOrderlessPartitions());
		KPartitions.setEvaluator(new org.matheclipse.core.reflection.system.KPartitions());
		Kurtosis.setEvaluator(new org.matheclipse.core.reflection.system.Kurtosis());
		LaguerreL.setEvaluator(new org.matheclipse.core.reflection.system.LaguerreL());
		LaplaceTransform.setEvaluator(new org.matheclipse.core.reflection.system.LaplaceTransform());
		LCM.setEvaluator(new org.matheclipse.core.reflection.system.LCM());
		LegendreP.setEvaluator(new org.matheclipse.core.reflection.system.LegendreP());
		Less.setEvaluator(new org.matheclipse.core.reflection.system.Less());
		LessEqual.setEvaluator(new org.matheclipse.core.reflection.system.LessEqual());
		LetterQ.setEvaluator(new org.matheclipse.core.reflection.system.LetterQ());
		Level.setEvaluator(new org.matheclipse.core.reflection.system.Level());
		Limit.setEvaluator(new org.matheclipse.core.reflection.system.Limit());
		LinearProgramming.setEvaluator(new org.matheclipse.core.reflection.system.LinearProgramming());
		Log.setEvaluator(new org.matheclipse.core.reflection.system.Log());
		Log10.setEvaluator(new org.matheclipse.core.reflection.system.Log10());
		Log2.setEvaluator(new org.matheclipse.core.reflection.system.Log2());
		LogisticSigmoid.setEvaluator(new org.matheclipse.core.reflection.system.LogisticSigmoid());
		LowerCaseQ.setEvaluator(new org.matheclipse.core.reflection.system.LowerCaseQ());
		LUDecomposition.setEvaluator(new org.matheclipse.core.reflection.system.LUDecomposition());
		ManhattanDistance.setEvaluator(new org.matheclipse.core.reflection.system.ManhattanDistance());
		Map.setEvaluator(new org.matheclipse.core.reflection.system.Map());
		MapAll.setEvaluator(new org.matheclipse.core.reflection.system.MapAll());
		MapAt.setEvaluator(new org.matheclipse.core.reflection.system.MapAt());
		MapThread.setEvaluator(new org.matheclipse.core.reflection.system.MapThread());
		MatchingDissimilarity.setEvaluator(new org.matheclipse.core.reflection.system.MatchingDissimilarity());
		MatrixPower.setEvaluator(new org.matheclipse.core.reflection.system.MatrixPower());
		MatrixRank.setEvaluator(new org.matheclipse.core.reflection.system.MatrixRank());
		Max.setEvaluator(new org.matheclipse.core.reflection.system.Max());
		Mean.setEvaluator(new org.matheclipse.core.reflection.system.Mean());
		Median.setEvaluator(new org.matheclipse.core.reflection.system.Median());
		Min.setEvaluator(new org.matheclipse.core.reflection.system.Min());
		Mod.setEvaluator(new org.matheclipse.core.reflection.system.Mod());
		MonomialList.setEvaluator(new org.matheclipse.core.reflection.system.MonomialList());
		Most.setEvaluator(new org.matheclipse.core.reflection.system.Most());
		Names.setEvaluator(new org.matheclipse.core.reflection.system.Names());
		NDSolve.setEvaluator(new org.matheclipse.core.reflection.system.NDSolve());
		Nearest.setEvaluator(new org.matheclipse.core.reflection.system.Nearest());
		Negative.setEvaluator(new org.matheclipse.core.reflection.system.Negative());
		NFourierTransform.setEvaluator(new org.matheclipse.core.reflection.system.NFourierTransform());
		NIntegrate.setEvaluator(new org.matheclipse.core.reflection.system.NIntegrate());
		NMaximize.setEvaluator(new org.matheclipse.core.reflection.system.NMaximize());
		NMinimize.setEvaluator(new org.matheclipse.core.reflection.system.NMinimize());
		NonCommutativeMultiply.setEvaluator(new org.matheclipse.core.reflection.system.NonCommutativeMultiply());
		NoneTrue.setEvaluator(new org.matheclipse.core.reflection.system.NoneTrue());
		NonNegative.setEvaluator(new org.matheclipse.core.reflection.system.NonNegative());
		Norm.setEvaluator(new org.matheclipse.core.reflection.system.Norm());
		Normal.setEvaluator(new org.matheclipse.core.reflection.system.Normal());
		Normalize.setEvaluator(new org.matheclipse.core.reflection.system.Normalize());
		Not.setEvaluator(new org.matheclipse.core.reflection.system.Not());
		NRoots.setEvaluator(new org.matheclipse.core.reflection.system.NRoots());
		NSolve.setEvaluator(new org.matheclipse.core.reflection.system.NSolve());
		NullSpace.setEvaluator(new org.matheclipse.core.reflection.system.NullSpace());
		Order.setEvaluator(new org.matheclipse.core.reflection.system.Order());
		OrderedQ.setEvaluator(new org.matheclipse.core.reflection.system.OrderedQ());
		Out.setEvaluator(new org.matheclipse.core.reflection.system.Out());
		Outer.setEvaluator(new org.matheclipse.core.reflection.system.Outer());
		PadLeft.setEvaluator(new org.matheclipse.core.reflection.system.PadLeft());
		PadRight.setEvaluator(new org.matheclipse.core.reflection.system.PadRight());
		Partition.setEvaluator(new org.matheclipse.core.reflection.system.Partition());
		PDF.setEvaluator(new org.matheclipse.core.reflection.system.PDF());
		Permutations.setEvaluator(new org.matheclipse.core.reflection.system.Permutations());
		Piecewise.setEvaluator(new org.matheclipse.core.reflection.system.Piecewise());
		Plot.setEvaluator(new org.matheclipse.core.reflection.system.Plot());
		Plot3D.setEvaluator(new org.matheclipse.core.reflection.system.Plot3D());
		Pochhammer.setEvaluator(new org.matheclipse.core.reflection.system.Pochhammer());
		PolyGamma.setEvaluator(new org.matheclipse.core.reflection.system.PolyGamma());
		PolyLog.setEvaluator(new org.matheclipse.core.reflection.system.PolyLog());
		Positive.setEvaluator(new org.matheclipse.core.reflection.system.Positive());
		PowerMod.setEvaluator(new org.matheclipse.core.reflection.system.PowerMod());
		PrimitiveRoots.setEvaluator(new org.matheclipse.core.reflection.system.PrimitiveRoots());
		Product.setEvaluator(new org.matheclipse.core.reflection.system.Product());
		ProductLog.setEvaluator(new org.matheclipse.core.reflection.system.ProductLog());
		PseudoInverse.setEvaluator(new org.matheclipse.core.reflection.system.PseudoInverse());
		Quotient.setEvaluator(new org.matheclipse.core.reflection.system.Quotient());
		RandomInteger.setEvaluator(new org.matheclipse.core.reflection.system.RandomInteger());
		RandomReal.setEvaluator(new org.matheclipse.core.reflection.system.RandomReal());
		RandomSample.setEvaluator(new org.matheclipse.core.reflection.system.RandomSample());
		Range.setEvaluator(new org.matheclipse.core.reflection.system.Range());
		Rationalize.setEvaluator(new org.matheclipse.core.reflection.system.Rationalize());
		Re.setEvaluator(new org.matheclipse.core.reflection.system.Re());
		Replace.setEvaluator(new org.matheclipse.core.reflection.system.Replace());
		ReplaceAll.setEvaluator(new org.matheclipse.core.reflection.system.ReplaceAll());
		ReplaceList.setEvaluator(new org.matheclipse.core.reflection.system.ReplaceList());
		ReplacePart.setEvaluator(new org.matheclipse.core.reflection.system.ReplacePart());
		ReplaceRepeated.setEvaluator(new org.matheclipse.core.reflection.system.ReplaceRepeated());
		Resultant.setEvaluator(new org.matheclipse.core.reflection.system.Resultant());
		Reverse.setEvaluator(new org.matheclipse.core.reflection.system.Reverse());
		RogersTanimotoDissimilarity
				.setEvaluator(new org.matheclipse.core.reflection.system.RogersTanimotoDissimilarity());
		Root.setEvaluator(new org.matheclipse.core.reflection.system.Root());
		RootIntervals.setEvaluator(new org.matheclipse.core.reflection.system.RootIntervals());
		Roots.setEvaluator(new org.matheclipse.core.reflection.system.Roots());
		Round.setEvaluator(new org.matheclipse.core.reflection.system.Round());
		RussellRaoDissimilarity.setEvaluator(new org.matheclipse.core.reflection.system.RussellRaoDissimilarity());
		SameQ.setEvaluator(new org.matheclipse.core.reflection.system.SameQ());
		SatisfiableQ.setEvaluator(new org.matheclipse.core.reflection.system.SatisfiableQ());
		Scan.setEvaluator(new org.matheclipse.core.reflection.system.Scan());
		Sec.setEvaluator(new org.matheclipse.core.reflection.system.Sec());
		Sech.setEvaluator(new org.matheclipse.core.reflection.system.Sech());
		Select.setEvaluator(new org.matheclipse.core.reflection.system.Select());
		Series.setEvaluator(new org.matheclipse.core.reflection.system.Series());
		SeriesData.setEvaluator(new org.matheclipse.core.reflection.system.SeriesData());
		Share.setEvaluator(new org.matheclipse.core.reflection.system.Share());
		Sign.setEvaluator(new org.matheclipse.core.reflection.system.Sign());
		SignCmp.setEvaluator(new org.matheclipse.core.reflection.system.SignCmp());
		Sin.setEvaluator(new org.matheclipse.core.reflection.system.Sin());
		Sinc.setEvaluator(new org.matheclipse.core.reflection.system.Sinc());
		SingularValueDecomposition
				.setEvaluator(new org.matheclipse.core.reflection.system.SingularValueDecomposition());
		Sinh.setEvaluator(new org.matheclipse.core.reflection.system.Sinh());
		SinIntegral.setEvaluator(new org.matheclipse.core.reflection.system.SinIntegral());
		Skewness.setEvaluator(new org.matheclipse.core.reflection.system.Skewness());
		SokalSneathDissimilarity.setEvaluator(new org.matheclipse.core.reflection.system.SokalSneathDissimilarity());
		Solve.setEvaluator(new org.matheclipse.core.reflection.system.Solve());
		SquaredEuclidianDistance.setEvaluator(new org.matheclipse.core.reflection.system.SquaredEuclidianDistance());
		SquareFreeQ.setEvaluator(new org.matheclipse.core.reflection.system.SquareFreeQ());
		StieltjesGamma.setEvaluator(new org.matheclipse.core.reflection.system.StieltjesGamma());
		StringDrop.setEvaluator(new org.matheclipse.core.reflection.system.StringDrop());
		StringJoin.setEvaluator(new org.matheclipse.core.reflection.system.StringJoin());
		StringLength.setEvaluator(new org.matheclipse.core.reflection.system.StringLength());
		StringTake.setEvaluator(new org.matheclipse.core.reflection.system.StringTake());
		StruveH.setEvaluator(new org.matheclipse.core.reflection.system.StruveH());
		StruveL.setEvaluator(new org.matheclipse.core.reflection.system.StruveL());
		Subsets.setEvaluator(new org.matheclipse.core.reflection.system.Subsets());
		Sum.setEvaluator(new org.matheclipse.core.reflection.system.Sum());
		Surd.setEvaluator(new org.matheclipse.core.reflection.system.Surd());
		SyntaxLength.setEvaluator(new org.matheclipse.core.reflection.system.SyntaxLength());
		Table.setEvaluator(new org.matheclipse.core.reflection.system.Table());
		Tally.setEvaluator(new org.matheclipse.core.reflection.system.Tally());
		Tan.setEvaluator(new org.matheclipse.core.reflection.system.Tan());
		Tanh.setEvaluator(new org.matheclipse.core.reflection.system.Tanh());
		Taylor.setEvaluator(new org.matheclipse.core.reflection.system.Taylor());
		Thread.setEvaluator(new org.matheclipse.core.reflection.system.Thread());
		ToCharacterCode.setEvaluator(new org.matheclipse.core.reflection.system.ToCharacterCode());
		ToPolarCoordinates.setEvaluator(new org.matheclipse.core.reflection.system.ToPolarCoordinates());
		ToString.setEvaluator(new org.matheclipse.core.reflection.system.ToString());
		Total.setEvaluator(new org.matheclipse.core.reflection.system.Total());
		ToUnicode.setEvaluator(new org.matheclipse.core.reflection.system.ToUnicode());
		TrigExpand.setEvaluator(new org.matheclipse.core.reflection.system.TrigExpand());
		TrigReduce.setEvaluator(new org.matheclipse.core.reflection.system.TrigReduce());
		TrigToExp.setEvaluator(new org.matheclipse.core.reflection.system.TrigToExp());
		Tuples.setEvaluator(new org.matheclipse.core.reflection.system.Tuples());
		Unequal.setEvaluator(new org.matheclipse.core.reflection.system.Unequal());
		Union.setEvaluator(new org.matheclipse.core.reflection.system.Union());
		UnitStep.setEvaluator(new org.matheclipse.core.reflection.system.UnitStep());
		UnitVector.setEvaluator(new org.matheclipse.core.reflection.system.UnitVector());
		UnsameQ.setEvaluator(new org.matheclipse.core.reflection.system.UnsameQ());
		VandermondeMatrix.setEvaluator(new org.matheclipse.core.reflection.system.VandermondeMatrix());
		Variance.setEvaluator(new org.matheclipse.core.reflection.system.Variance());
		VectorAngle.setEvaluator(new org.matheclipse.core.reflection.system.VectorAngle());
		Xor.setEvaluator(new org.matheclipse.core.reflection.system.Xor());
		YuleDissimilarity.setEvaluator(new org.matheclipse.core.reflection.system.YuleDissimilarity());
		Zeta.setEvaluator(new org.matheclipse.core.reflection.system.Zeta());
	}

	final static FunctionDefinitions CONST = new FunctionDefinitions();

	public static FunctionDefinitions initialize() {
		return CONST;
	}

	private FunctionDefinitions() {

	}
}
