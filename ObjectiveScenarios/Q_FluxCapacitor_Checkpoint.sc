<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_FluxCapacitor_Checkpoint.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>71</x>
        <y>173</y>
        <center>
          <x>146.5</x>
          <y>245.5</y>
        </center>
        <width>151</width>
        <height>145</height>
        <xMin>71</xMin>
        <yMin>173</yMin>
        <xMax>222</xMax>
        <yMax>318</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You've arrived at the T.O.R.V.A.K. checkpoint the professor suggested you should check out.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Torvak</enemyType>
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Attack the facility!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>109</y>
                <center>
                  <x>144</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>109</yMin>
                <xMax>149</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>127</y>
                <center>
                  <x>144</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>127</yMin>
                <xMax>149</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Radio the facility.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>266</x>
        <y>687</y>
        <center>
          <x>341</x>
          <y>737</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>266</xMin>
        <yMin>687</yMin>
        <xMax>416</xMax>
        <yMax>787</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You defeat the final T.O.R.V.A.K. vehicle defending the checkpoint.

[0loot]

Upon inspection of the checkpoint, you access their datafiles and acquire the location of the nearest Pylon Facility.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>323</x>
        <y>306</y>
        <center>
          <x>398.5</x>
          <y>379.5</y>
        </center>
        <width>151</width>
        <height>147</height>
        <xMin>323</xMin>
        <yMin>306</yMin>
        <xMax>474</xMax>
        <yMax>453</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Greetings.

We are T.O.R.V.A.K.

Please prepare to have your vehicles scanned."</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Torvak</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Nope... attack!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>109</y>
                <center>
                  <x>144</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>109</yMin>
                <xMax>149</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>127</y>
                <center>
                  <x>144</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>127</yMin>
                <xMax>149</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Very well.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>559</x>
        <y>297</y>
        <center>
          <x>634</x>
          <y>347</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>559</xMin>
        <yMin>297</yMin>
        <xMax>709</xMax>
        <yMax>397</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"We have determined that your vehicles are too much of a threat to our security.

Prepare to be annihilated."

Several T.O.R.V.A.K. vehicles appear from the checkpoint and approach your convoy.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Torvak</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>565</x>
        <y>443</y>
        <center>
          <x>701.5</x>
          <y>494.5</y>
        </center>
        <width>273</width>
        <height>103</height>
        <xMin>565</xMin>
        <yMin>443</yMin>
        <xMax>838</xMax>
        <yMax>546</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"We thank you for your cooperation.

What is it you desire?"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>261</x>
                <y>65</y>
                <center>
                  <x>266</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>261</xMin>
                <yMin>65</yMin>
                <xMax>271</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>261</x>
                <y>83</y>
                <center>
                  <x>266</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>261</xMin>
                <yMin>83</yMin>
                <xMax>271</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Request the location of a Pylon Facility.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>321</x>
        <y>170</y>
        <center>
          <x>396</x>
          <y>220</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>321</xMin>
        <yMin>170</yMin>
        <xMax>471</xMax>
        <yMax>270</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The checkpoint does not appear to be interested in conversation, as several vehicles appear from within and approach your convoy.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Torvak</enemyType>
              <difficulty>2</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>926</x>
        <y>505</y>
        <center>
          <x>1001.5</x>
          <y>555</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>926</xMin>
        <yMin>505</yMin>
        <xMax>1077</xMax>
        <yMax>605</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Your knowledge of T.O.R.V.A.K. Pylon Facilities is unacceptable.

Percentage of success when attacking you, insufficient.

We shall provide you with your requested information."</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>923</x>
        <y>336</y>
        <center>
          <x>998</x>
          <y>386</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>923</xMin>
        <yMin>336</yMin>
        <xMax>1073</xMax>
        <yMax>436</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Your knowledge of T.O.R.V.A.K. Pylon Facilities is unacceptable.

Prepare to be annihilated!"

Several T.O.R.V.A.K. vehicles appear from the checkpoint and approach your convoy.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Torvak</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1111</x>
        <y>714</y>
        <center>
          <x>1208</x>
          <y>764</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>1111</xMin>
        <yMin>714</yMin>
        <xMax>1305</xMax>
        <yMax>814</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The checkpoint sends you the coordinates to the nearest Pylon Facility.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_PylonRaid</nodeName>
              <nodeDiscription>You have acquired the location of a T.O.R.V.A.K. Pylon Facility from one of their checkpoints.

The professor requires an Energy Pylon from such a facility, you should head over and obtain one.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>545</x>
        <y>734</y>
        <center>
          <x>642</x>
          <y>784</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>545</xMin>
        <yMin>734</yMin>
        <xMax>739</xMax>
        <yMax>834</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You add the coordinates of the Pylon Facility to your map and prepare to head out.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_PylonRaid</nodeName>
              <nodeDiscription>After wiping out a T.O.R.V.A.K. checkpoint and accessing their data files, you have located a Pylon Facility.

The professor requires an Energy Pylon from such a facility, you should head over and obtain one.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Move out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_FluxCapacitor_Checkpoint</Name>
</Scenario>