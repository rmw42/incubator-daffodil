/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.daffodil

import org.apache.daffodil.util.Misc
import org.junit.Test
import org.apache.daffodil.tdml.DFDLTestSuite

class TresysTests2 {
  val testDir = "/test-suite/tresys-contributed/"

  // This test passes now. Left this here to cut/paste for running other tests.
  //  val ai = testDir + "AI.tdml"
  //  lazy val runnerAI = new DFDLTestSuite(Misc.getRequiredResource(ai))
  //
  //  @Test def test_AI000() { runnerAI.runOneTest("AI000") }

  //  lazy val runnerMB = new DFDLTestSuite(Misc.getRequiredResource(testDir + "mixed-binary-text.tdml"))
  //
  //  @Test def test_codingErrorAction() { runnerMB.runOneTest("codingErrorAction") }

  //  val ab = testDir + "ABLargeData.tdml.dat"
  //  lazy val runnerAB = new DFDLTestSuite(Misc.getRequiredResource(ab))
  // Too slow to use in regression. So slow it's a bug.

  val ap = testDir + "AP.tdml"
  lazy val runnerAP = new DFDLTestSuite(Misc.getRequiredResource(ap))
  @Test def test_AP000() { runnerAP.runOneTest("AP000") } // lengthKind endOfParent

  val at = testDir + "AT.tdml"
  lazy val runnerAT = new DFDLTestSuite(Misc.getRequiredResource(at))
  @Test def test_AT000() { runnerAT.runOneTest("AT000") } // needs newVariableInstance
  @Test def test_AT001() { runnerAT.runOneTest("AT001") } // needs newVariableInstance

  val au = testDir + "AU.tdml"
  lazy val runnerAU = new DFDLTestSuite(Misc.getRequiredResource(au))
  @Test def test_AU000() { runnerAU.runOneTest("AU000") } // packed and bcd

  val bb = testDir + "BB.tdml"
  lazy val runnerBB = new DFDLTestSuite(Misc.getRequiredResource(bb))
  @Test def test_BB000() { runnerBB.runOneTest("BB000") } // occursCountKind stopValue

  val be = testDir + "BE.tdml"
  lazy val runnerBE = new DFDLTestSuite(Misc.getRequiredResource(be))
  //DFDL-1010
  @Test def test_BE000() { runnerBE.runOneTest("BE000") } // unordered sequences
  @Test def test_BE001() { runnerBE.runOneTest("BE001") }

  val bf = testDir + "BF.tdml"
  lazy val runnerBF1 = new DFDLTestSuite(Misc.getRequiredResource(bf))
  //DFDL-1010
  @Test def test_BF000() { runnerBF1.runOneTest("BF000") } // unordered sequences
  @Test def test_BF001() { runnerBF1.runOneTest("BF001") }

  val bg = testDir + "BG.tdml"
  lazy val runnerBG = new DFDLTestSuite(Misc.getRequiredResource(bg))
  @Test def test_BG000() { runnerBG.runOneTest("BG000") } // needs text numbers: advanced properties (DFDL-452)

  val sq = testDir + "sequence.tdml"
  lazy val runnerSQ = new DFDLTestSuite(Misc.getRequiredResource(sq))
  @Test def test_seq1() { runnerSQ.runOneTest("seq1") }

  lazy val runnerMB = new DFDLTestSuite(Misc.getRequiredResource(testDir + "mixed-binary-text.tdml"))

  // DFDL-935
  @Test def test_t1() { runnerMB.runOneTest("t1") }
  @Test def test_t2() { runnerMB.runOneTest("t2") }
  @Test def test_t3() { runnerMB.runOneTest("t3") }
  @Test def test_encodingErrorPolicy_error() { runnerMB.runOneTest("encodingErrorPolicy_error") }
}
