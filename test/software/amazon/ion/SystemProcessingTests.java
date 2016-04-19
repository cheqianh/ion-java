/*
 * Copyright 2008-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at:
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */

package software.amazon.ion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TextIteratorSystemProcessingTest.class,
    TextByteArrayIteratorSystemProcessingTest.class,
    BinaryByteArrayIteratorSystemProcessingTest.class,
    JavaReaderIteratorSystemProcessingTest.class,
    BinaryStreamIteratorSystemProcessingTest.class,
    TextStreamIteratorSystemProcessingTest.class,
    LoadTextBytesSystemProcessingTest.class,
    LoadTextStreamSystemProcessingTest.class,
    LoadBinaryBytesSystemProcessingTest.class,
    LoadBinaryStreamSystemProcessingTest.class,
    DatagramIteratorSystemProcessingTest.class,
    BinaryReaderSystemProcessingTest.class,
    DatagramTreeReaderSystemProcessingTest.class,
    TextReaderSystemProcessingTest.class,
    NewDatagramIteratorSystemProcessingTest.class,
    TrBwBrProcessingTest.class
})
public class SystemProcessingTests
{
}
