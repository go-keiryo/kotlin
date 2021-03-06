/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class ReferenceResolveInJavaTestGenerated extends AbstractReferenceResolveInJavaTest {
    @TestMetadata("idea/testData/resolve/referenceInJava/binaryAndSource")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class BinaryAndSource extends AbstractReferenceResolveInJavaTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInBinaryAndSource() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/resolve/referenceInJava/binaryAndSource"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Class.java")
        public void testClass() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/Class.java");
        }

        @TestMetadata("ClassObjectField.java")
        public void testClassObjectField() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/ClassObjectField.java");
        }

        @TestMetadata("Constructor.java")
        public void testConstructor() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/Constructor.java");
        }

        @TestMetadata("EnumEntry.java")
        public void testEnumEntry() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/EnumEntry.java");
        }

        @TestMetadata("Field.java")
        public void testField() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/Field.java");
        }

        @TestMetadata("FileFacade.java")
        public void testFileFacade() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/FileFacade.java");
        }

        @TestMetadata("Getter.java")
        public void testGetter() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/Getter.java");
        }

        @TestMetadata("Method.java")
        public void testMethod() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/Method.java");
        }

        @TestMetadata("MethodOfDeeplyNested.java")
        public void testMethodOfDeeplyNested() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/MethodOfDeeplyNested.java");
        }

        @TestMetadata("MethodWithParameters.java")
        public void testMethodWithParameters() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/MethodWithParameters.java");
        }

        @TestMetadata("ObjectInstance.java")
        public void testObjectInstance() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/ObjectInstance.java");
        }

        @TestMetadata("PlatformStaticFun.java")
        public void testPlatformStaticFun() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/binaryAndSource/PlatformStaticFun.java");
        }
    }

    @TestMetadata("idea/testData/resolve/referenceInJava/sourceOnly")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SourceOnly extends AbstractReferenceResolveInJavaTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInSourceOnly() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/resolve/referenceInJava/sourceOnly"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("AnnotationParameterReference.java")
        public void testAnnotationParameterReference() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/sourceOnly/AnnotationParameterReference.java");
        }

        @TestMetadata("AutoGeneratedOverloads.java")
        public void testAutoGeneratedOverloads() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/sourceOnly/AutoGeneratedOverloads.java");
        }

        @TestMetadata("ClassObjectStaticField.java")
        public void testClassObjectStaticField() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/sourceOnly/ClassObjectStaticField.java");
        }

        @TestMetadata("DelegatedMethodFromTraitNoImpl.java")
        public void testDelegatedMethodFromTraitNoImpl() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/sourceOnly/DelegatedMethodFromTraitNoImpl.java");
        }

        @TestMetadata("DelegatedMethodFromTraitWithImpl.java")
        public void testDelegatedMethodFromTraitWithImpl() throws Exception {
            runTest("idea/testData/resolve/referenceInJava/sourceOnly/DelegatedMethodFromTraitWithImpl.java");
        }
    }
}
