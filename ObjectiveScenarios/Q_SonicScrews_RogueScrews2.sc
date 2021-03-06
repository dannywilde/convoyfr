﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_SonicScrews_RogueScrews2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>280</x>
        <y>127</y>
        <position>
          <x>280</x>
          <y>127</y>
        </position>
        <center>
          <x>363</x>
          <y>187.5</y>
        </center>
        <min>
          <x>280</x>
          <y>127</y>
        </min>
        <max>
          <x>446</x>
          <y>248</y>
        </max>
        <width>166</width>
        <height>121</height>
        <size>
          <x>166</x>
          <y>121</y>
        </size>
        <xMin>280</xMin>
        <yMin>127</yMin>
        <xMax>446</xMax>
        <yMax>248</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You return to the T.O.R.V.A.K. Intelligence Hub.
</Text>
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
                <x>154</x>
                <y>65</y>
                <position>
                  <x>154</x>
                  <y>65</y>
                </position>
                <center>
                  <x>159</x>
                  <y>70</y>
                </center>
                <min>
                  <x>154</x>
                  <y>65</y>
                </min>
                <max>
                  <x>164</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>154</xMin>
                <yMin>65</yMin>
                <xMax>164</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>6</ToDialog>
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
                <x>154</x>
                <y>83</y>
                <position>
                  <x>154</x>
                  <y>83</y>
                </position>
                <center>
                  <x>159</x>
                  <y>88</y>
                </center>
                <min>
                  <x>154</x>
                  <y>83</y>
                </min>
                <max>
                  <x>164</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>154</xMin>
                <yMin>83</yMin>
                <xMax>164</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Report your success.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>336</x>
        <y>505</y>
        <position>
          <x>336</x>
          <y>505</y>
        </position>
        <center>
          <x>438.5</x>
          <y>565.5</y>
        </center>
        <min>
          <x>336</x>
          <y>505</y>
        </min>
        <max>
          <x>541</x>
          <y>626</y>
        </max>
        <width>205</width>
        <height>121</height>
        <size>
          <x>205</x>
          <y>121</y>
        </size>
        <xMin>336</xMin>
        <yMin>505</yMin>
        <xMax>541</xMax>
        <yMax>626</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You've destroyed all of the T.O.R.V.A.K. vehicles.

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
                <x>193</x>
                <y>65</y>
                <position>
                  <x>193</x>
                  <y>65</y>
                </position>
                <center>
                  <x>198</x>
                  <y>70</y>
                </center>
                <min>
                  <x>193</x>
                  <y>65</y>
                </min>
                <max>
                  <x>203</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>65</yMin>
                <xMax>203</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
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
                <x>193</x>
                <y>83</y>
                <position>
                  <x>193</x>
                  <y>83</y>
                </position>
                <center>
                  <x>198</x>
                  <y>88</y>
                </center>
                <min>
                  <x>193</x>
                  <y>83</y>
                </min>
                <max>
                  <x>203</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>83</yMin>
                <xMax>203</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>5</ToDialog>
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
                <x>193</x>
                <y>101</y>
                <position>
                  <x>193</x>
                  <y>101</y>
                </position>
                <center>
                  <x>198</x>
                  <y>106</y>
                </center>
                <min>
                  <x>193</x>
                  <y>101</y>
                </min>
                <max>
                  <x>203</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>101</yMin>
                <xMax>203</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Search the intelligence hub.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>577</x>
        <y>213</y>
        <position>
          <x>577</x>
          <y>213</y>
        </position>
        <center>
          <x>652</x>
          <y>263.5</y>
        </center>
        <min>
          <x>577</x>
          <y>213</y>
        </min>
        <max>
          <x>727</x>
          <y>314</y>
        </max>
        <width>150</width>
        <height>101</height>
        <size>
          <x>150</x>
          <y>101</y>
        </size>
        <xMin>577</xMin>
        <yMin>213</yMin>
        <xMax>727</xMax>
        <yMax>314</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you see several T.O.R.V.A.K. vehicles rapidly approaching, it becomes evident they were not intending to keep their end of the deal.</Text>
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
              <enemyType>Torvak</enemyType>
              <difficulty>2</difficulty>
            </ButtonAction>
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
              <enemyType>Torvak</enemyType>
              <difficulty>4</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>834</x>
        <y>397</y>
        <position>
          <x>834</x>
          <y>397</y>
        </position>
        <center>
          <x>931</x>
          <y>447</y>
        </center>
        <min>
          <x>834</x>
          <y>397</y>
        </min>
        <max>
          <x>1028</x>
          <y>497</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>834</xMin>
        <yMin>397</yMin>
        <xMax>1028</xMax>
        <yMax>497</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>With no guards, you easily scour the intelligence hub for any relevant information on Sonic Screws.

You find the location of a T.O.R.V.A.K. Sonic Screw production facility!</Text>
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
              <nodeName>Q_SonicScrews_Facility</nodeName>
              <nodeDiscription>You've found the location of a T.O.R.V.A.K. Sonic Screw production facility.

Its location has been added to your map.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Roll out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>760</x>
        <y>692</y>
        <position>
          <x>760</x>
          <y>692</y>
        </position>
        <center>
          <x>835</x>
          <y>742</y>
        </center>
        <min>
          <x>760</x>
          <y>692</y>
        </min>
        <max>
          <x>910</x>
          <y>792</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>760</xMin>
        <yMin>692</yMin>
        <xMax>910</xMax>
        <yMax>792</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>With no guards, you easily scour the intelligence hub for any relevant information on Sonic Screws.

What you find, however, exceeds your expectations. You find a cache of Sonic Screws that should prove more than sufficient for spaceship Mercury.

After switly transferring them to your MCV, you prepare to roll out!</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <position>
                  <x>138</x>
                  <y>65</y>
                </position>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <min>
                  <x>138</x>
                  <y>65</y>
                </min>
                <max>
                  <x>148</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>830</x>
        <y>540</y>
        <position>
          <x>830</x>
          <y>540</y>
        </position>
        <center>
          <x>927</x>
          <y>604.4551</y>
        </center>
        <min>
          <x>830</x>
          <y>540</y>
        </min>
        <max>
          <x>1024</x>
          <y>668.910156</y>
        </max>
        <width>194</width>
        <height>128.910156</height>
        <size>
          <x>194</x>
          <y>128.910156</y>
        </size>
        <xMin>830</xMin>
        <yMin>540</yMin>
        <xMax>1024</xMax>
        <yMax>668.910156</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>With no guards, you easily scour the intelligence hub for any relevant information on Sonic Screws.

You find the location of what seems to be called the "T.O.R.V.A.K. Mobile Sonic Screw Platform".</Text>
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
              <nodeName>Q_SonicScrews_Miniboss</nodeName>
              <nodeDiscription>You've discovered that T.O.R.V.A.K. produces Sonic Screws on some sort of mobile platform.

Its current location has been added to your map.</nodeDiscription>
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
        <x>564</x>
        <y>-7</y>
        <position>
          <x>564</x>
          <y>-7</y>
        </position>
        <center>
          <x>639</x>
          <y>43</y>
        </center>
        <min>
          <x>564</x>
          <y>-7</y>
        </min>
        <max>
          <x>714</x>
          <y>93</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>564</xMin>
        <yMin>-7</yMin>
        <xMax>714</xMax>
        <yMax>93</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Congratulations on your success.

We shall keep our end of the transaction, prepare to receive cargo."

Moments later, a small transport vehicle approaches your convoy and delivers an ample supply of Sonic Screws.
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <position>
                  <x>138</x>
                  <y>65</y>
                </position>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <min>
                  <x>138</x>
                  <y>65</y>
                </min>
                <max>
                  <x>148</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_SonicScrews_RogueScrews2</Name>
</Scenario>