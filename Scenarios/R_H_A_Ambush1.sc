﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/R_H_A_Ambush1.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>197</x>
        <y>230</y>
        <position>
          <x>197</x>
          <y>230</y>
        </position>
        <center>
          <x>399.5</x>
          <y>305.699219</y>
        </center>
        <min>
          <x>197</x>
          <y>230</y>
        </min>
        <max>
          <x>602</x>
          <y>381.398438</y>
        </max>
        <width>405</width>
        <height>151.398438</height>
        <size>
          <x>405</x>
          <y>151.398438</y>
        </size>
        <xMin>197</xMin>
        <yMin>230</yMin>
        <xMax>602</xMax>
        <yMax>381.398438</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>As you drive along the road, you see several gruesome heads upon pikes. It looks like someone is trying to portray a message.</Text>
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
                <x>393</x>
                <y>65</y>
                <position>
                  <x>393</x>
                  <y>65</y>
                </position>
                <center>
                  <x>398</x>
                  <y>70</y>
                </center>
                <min>
                  <x>393</x>
                  <y>65</y>
                </min>
                <max>
                  <x>403</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>393</xMin>
                <yMin>65</yMin>
                <xMax>403</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Our mission is too important to be intimidated. Onwards!</Name>
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
                <x>393</x>
                <y>109</y>
                <position>
                  <x>393</x>
                  <y>109</y>
                </position>
                <center>
                  <x>398</x>
                  <y>114</y>
                </center>
                <min>
                  <x>393</x>
                  <y>109</y>
                </min>
                <max>
                  <x>403</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>393</xMin>
                <yMin>109</yMin>
                <xMax>403</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
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
                <x>393</x>
                <y>127</y>
                <position>
                  <x>393</x>
                  <y>127</y>
                </position>
                <center>
                  <x>398</x>
                  <y>132</y>
                </center>
                <min>
                  <x>393</x>
                  <y>127</y>
                </min>
                <max>
                  <x>403</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>393</xMin>
                <yMin>127</yMin>
                <xMax>403</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Divert course. We'll have nothing to do with this.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>260</x>
        <y>482</y>
        <position>
          <x>260</x>
          <y>482</y>
        </position>
        <center>
          <x>335</x>
          <y>533.5</y>
        </center>
        <min>
          <x>260</x>
          <y>482</y>
        </min>
        <max>
          <x>410</x>
          <y>585</y>
        </max>
        <width>150</width>
        <height>103</height>
        <size>
          <x>150</x>
          <y>103</y>
        </size>
        <xMin>260</xMin>
        <yMin>482</yMin>
        <xMax>410</xMax>
        <yMax>585</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]

You feel a sense of pride in ridding the lands of these bloodthirsty maniacs.</Text>
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
              <Chance>10</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
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
                <x>138</x>
                <y>83</y>
                <position>
                  <x>138</x>
                  <y>83</y>
                </position>
                <center>
                  <x>143</x>
                  <y>88</y>
                </center>
                <min>
                  <x>138</x>
                  <y>83</y>
                </min>
                <max>
                  <x>148</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>83</yMin>
                <xMax>148</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>718</x>
        <y>244</y>
        <position>
          <x>718</x>
          <y>244</y>
        </position>
        <center>
          <x>813</x>
          <y>319.699219</y>
        </center>
        <min>
          <x>718</x>
          <y>244</y>
        </min>
        <max>
          <x>908</x>
          <y>395.398438</y>
        </max>
        <width>190</width>
        <height>151.398438</height>
        <size>
          <x>190</x>
          <y>151.398438</y>
        </size>
        <xMin>718</xMin>
        <yMin>244</yMin>
        <xMax>908</xMax>
        <yMax>395.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Blood-splattered vehicles appear from out of nowhere. You will have to defend yourself!</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableWarZone">
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
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Attack!</Name>
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
                <x>178</x>
                <y>109</y>
                <position>
                  <x>178</x>
                  <y>109</y>
                </position>
                <center>
                  <x>183</x>
                  <y>114</y>
                </center>
                <min>
                  <x>178</x>
                  <y>109</y>
                </min>
                <max>
                  <x>188</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>178</xMin>
                <yMin>109</yMin>
                <xMax>188</xMax>
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
                <x>178</x>
                <y>127</y>
                <position>
                  <x>178</x>
                  <y>127</y>
                </position>
                <center>
                  <x>183</x>
                  <y>132</y>
                </center>
                <min>
                  <x>178</x>
                  <y>127</y>
                </min>
                <max>
                  <x>188</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>178</xMin>
                <yMin>127</yMin>
                <xMax>188</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Try to outrun them.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1024</x>
        <y>213</y>
        <position>
          <x>1024</x>
          <y>213</y>
        </position>
        <center>
          <x>1105.5</x>
          <y>263</y>
        </center>
        <min>
          <x>1024</x>
          <y>213</y>
        </min>
        <max>
          <x>1187</x>
          <y>313</y>
        </max>
        <width>163</width>
        <height>100</height>
        <size>
          <x>163</x>
          <y>100</y>
        </size>
        <xMin>1024</xMin>
        <yMin>213</yMin>
        <xMax>1187</xMax>
        <yMax>313</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You manage to outrun these wretched maniacs.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
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
            </ButtonAction>
          </Actions>
          <Name>Phew!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1014</x>
        <y>367</y>
        <position>
          <x>1014</x>
          <y>367</y>
        </position>
        <center>
          <x>1121</x>
          <y>417</y>
        </center>
        <min>
          <x>1014</x>
          <y>367</y>
        </min>
        <max>
          <x>1228</x>
          <y>467</y>
        </max>
        <width>214</width>
        <height>100</height>
        <size>
          <x>214</x>
          <y>100</y>
        </size>
        <xMin>1014</xMin>
        <yMin>367</yMin>
        <xMax>1228</xMax>
        <yMax>467</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You outrun these wretched maniacs, but not before they've managed to get some shots in on your vehicles.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="DamageRandomCar">
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
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>false</random>
              <AmountAP>70</AmountAP>
              <AmountHP>70</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Curses!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>744</x>
        <y>446</y>
        <position>
          <x>744</x>
          <y>446</y>
        </position>
        <center>
          <x>825.5</x>
          <y>496</y>
        </center>
        <min>
          <x>744</x>
          <y>446</y>
        </min>
        <max>
          <x>907</x>
          <y>546</y>
        </max>
        <width>163</width>
        <height>100</height>
        <size>
          <x>163</x>
          <y>100</y>
        </size>
        <xMin>744</xMin>
        <yMin>446</yMin>
        <xMax>907</xMax>
        <yMax>546</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You stay clear of the carnage and don't seem to attract any unwanted attention.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
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
            </ButtonAction>
          </Actions>
          <Name>Good...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>482</x>
        <y>573</y>
        <position>
          <x>482</x>
          <y>573</y>
        </position>
        <center>
          <x>602.5</x>
          <y>637.5</y>
        </center>
        <min>
          <x>482</x>
          <y>573</y>
        </min>
        <max>
          <x>723</x>
          <y>702</y>
        </max>
        <width>241</width>
        <height>129</height>
        <size>
          <x>241</x>
          <y>129</y>
        </size>
        <xMin>482</xMin>
        <yMin>573</yMin>
        <xMax>723</xMax>
        <yMax>702</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You found a holodisc amongst the loot.

It seems to be an advertisement for the Lucky Peacock, a travelling casino.

Since the casino travels around it can be difficult to locate, this holodisc has the latest coordinates, however!</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddSideObjective">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>229</x>
                <y>65</y>
                <position>
                  <x>229</x>
                  <y>65</y>
                </position>
                <center>
                  <x>234</x>
                  <y>70</y>
                </center>
                <min>
                  <x>229</x>
                  <y>65</y>
                </min>
                <max>
                  <x>239</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>229</xMin>
                <yMin>65</yMin>
                <xMax>239</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>G_U_Casino</nodeName>
              <objective>
                <nodeIndex>0</nodeIndex>
                <name>Lucky Roller</name>
                <discription>Lucky Roller</discription>
                <number>14</number>
                <nodes>
                  <ObjectiveNode>
                    <nodeDiscription>You have found the location of the Lucky Peacock, the travelling casino.

Head over to try your luck!</nodeDiscription>
                    <location>
                      <x>0</x>
                      <y>0</y>
                    </location>
                    <scenarioName />
                  </ObjectiveNode>
                </nodes>
                <state>Start</state>
              </objective>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Add the coordinates to your map.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
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
            </ButtonAction>
          </Actions>
          <Name>Not interested.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>R_H_A_Ambush1</Name>
</Scenario>