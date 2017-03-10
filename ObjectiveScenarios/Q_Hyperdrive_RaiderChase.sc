<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Hyperdrive_RaiderChase.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>175</x>
        <y>287</y>
        <position>
          <x>175</x>
          <y>287</y>
        </position>
        <center>
          <x>250.5</x>
          <y>338.5</y>
        </center>
        <min>
          <x>175</x>
          <y>287</y>
        </min>
        <max>
          <x>326</x>
          <y>390</y>
        </max>
        <width>151</width>
        <height>103</height>
        <size>
          <x>151</x>
          <y>103</y>
        </size>
        <xMin>175</xMin>
        <yMin>287</yMin>
        <xMax>326</xMax>
        <yMax>390</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You've caught up to the raiders responsible for the destruction of Whiteborough!

Andy's eyes light up. "Slaughter them!"</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Attack!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>230</x>
        <y>615</y>
        <position>
          <x>230</x>
          <y>615</y>
        </position>
        <center>
          <x>310.5</x>
          <y>675.5</y>
        </center>
        <min>
          <x>230</x>
          <y>615</y>
        </min>
        <max>
          <x>391</x>
          <y>736</y>
        </max>
        <width>161</width>
        <height>121</height>
        <size>
          <x>161</x>
          <y>121</y>
        </size>
        <xMin>230</xMin>
        <yMin>615</yMin>
        <xMax>391</xMax>
        <yMax>736</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>With the last raider vehicle destroyed, you hope this will bring peace to the deceased citizens of Whiteborough.

[0loot]</Text>
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
                <x>149</x>
                <y>65</y>
                <position>
                  <x>149</x>
                  <y>65</y>
                </position>
                <center>
                  <x>154</x>
                  <y>70</y>
                </center>
                <min>
                  <x>149</x>
                  <y>65</y>
                </min>
                <max>
                  <x>159</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>149</xMin>
                <yMin>65</yMin>
                <xMax>159</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>149</x>
                <y>83</y>
                <position>
                  <x>149</x>
                  <y>83</y>
                </position>
                <center>
                  <x>154</x>
                  <y>88</y>
                </center>
                <min>
                  <x>149</x>
                  <y>83</y>
                </min>
                <max>
                  <x>159</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>149</xMin>
                <yMin>83</yMin>
                <xMax>159</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>149</x>
                <y>101</y>
                <position>
                  <x>149</x>
                  <y>101</y>
                </position>
                <center>
                  <x>154</x>
                  <y>106</y>
                </center>
                <min>
                  <x>149</x>
                  <y>101</y>
                </min>
                <max>
                  <x>159</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>149</xMin>
                <yMin>101</yMin>
                <xMax>159</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Are we done, Andy?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>485</x>
        <y>505</y>
        <position>
          <x>485</x>
          <y>505</y>
        </position>
        <center>
          <x>582</x>
          <y>555</y>
        </center>
        <min>
          <x>485</x>
          <y>505</y>
        </min>
        <max>
          <x>679</x>
          <y>605</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>485</xMin>
        <yMin>505</yMin>
        <xMax>679</xMax>
        <yMax>605</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"That we are, O my brother.

Return me to the Sasiak milkbar, and I shall supply you with your precious Hyperdrive Stabilizers."</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_Reward</nodeName>
              <nodeDiscription>You have brought the raiders responsible for the carnage at Whiteborough to justice.

Andy has promised to give you the Hyperdrive Stabilizers after you've returned him to the Sasiak milkbar.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Hyperdrive</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>To the milkbar!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>523</x>
        <y>637</y>
        <position>
          <x>523</x>
          <y>637</y>
        </position>
        <center>
          <x>620</x>
          <y>687</y>
        </center>
        <min>
          <x>523</x>
          <y>637</y>
        </min>
        <max>
          <x>717</x>
          <y>737</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>523</xMin>
        <yMin>637</yMin>
        <xMax>717</xMax>
        <yMax>737</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Afraid not, O my brother.

There is a privateer base that operates in this area, which has eluded me thusfar.

However, I now know of its location. So naturally, we are heading over and are destroying it."</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>You have brought the raiders responsible for the carnage at Whiteborough to justice.

Andy now wants you to destroy a nearby privateer base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>7</distance>
            </ButtonAction>
          </Actions>
          <Name>Very well.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>499</x>
        <y>776</y>
        <position>
          <x>499</x>
          <y>776</y>
        </position>
        <center>
          <x>596</x>
          <y>826</y>
        </center>
        <min>
          <x>499</x>
          <y>776</y>
        </min>
        <max>
          <x>693</x>
          <y>876</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>499</xMin>
        <yMin>776</yMin>
        <xMax>693</xMax>
        <yMax>876</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Afraid not, O my brother.

There is a T.O.R.V.A.K. Checkpoint nearby that is rumoured to perform experiments on the local population.

Whilst that isn't surprising in its own right, considering this is T.O.R.V.A.K. we are talking about, they've made a vital mistake.

The last person they kidnapped was a personal relation of mine... so naturally, we are going to get him back."</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_TorvakStart2</nodeName>
              <nodeDiscription>You have brought the raiders responsible for the carnage at Whiteborough to justice.

Andy now wants you to investigate a T.O.R.V.A.K. Checkpoint which has kidnapped a personal relation.</nodeDiscription>
              <pos>Distance</pos>
              <distance>8</distance>
            </ButtonAction>
          </Actions>
          <Name>Roll out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Hyperdrive_RaiderChase</Name>
</Scenario>