﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/R_D_A_Ambush1.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>165</x>
        <y>152</y>
        <position>
          <x>165</x>
          <y>152</y>
        </position>
        <center>
          <x>291.5</x>
          <y>233.5</y>
        </center>
        <min>
          <x>165</x>
          <y>152</y>
        </min>
        <max>
          <x>418</x>
          <y>315</y>
        </max>
        <width>253</width>
        <height>163</height>
        <size>
          <x>253</x>
          <y>163</y>
        </size>
        <xMin>165</xMin>
        <yMin>152</yMin>
        <xMax>418</xMax>
        <yMax>315</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You hear a horrifying voice coming from your radio: "I am the Nightrider. I'm a fuel injected suicide machine. I am the rocker, I am the roller, I am the out-of-controller! Prepare to die!"</Text>
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
              <Chance>2</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
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
          <Name>Prepare to fight.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>241</x>
                <y>127</y>
                <position>
                  <x>241</x>
                  <y>127</y>
                </position>
                <center>
                  <x>246</x>
                  <y>132</y>
                </center>
                <min>
                  <x>241</x>
                  <y>127</y>
                </min>
                <max>
                  <x>251</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>241</xMin>
                <yMin>127</yMin>
                <xMax>251</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>241</x>
                <y>145</y>
                <position>
                  <x>241</x>
                  <y>145</y>
                </position>
                <center>
                  <x>246</x>
                  <y>150</y>
                </center>
                <min>
                  <x>241</x>
                  <y>145</y>
                </min>
                <max>
                  <x>251</x>
                  <y>155</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>241</xMin>
                <yMin>145</yMin>
                <xMax>251</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines to escape! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>170</x>
        <y>370</y>
        <position>
          <x>170</x>
          <y>370</y>
        </position>
        <center>
          <x>245</x>
          <y>420.5</y>
        </center>
        <min>
          <x>170</x>
          <y>370</y>
        </min>
        <max>
          <x>320</x>
          <y>471</y>
        </max>
        <width>150</width>
        <height>101</height>
        <size>
          <x>150</x>
          <y>101</y>
        </size>
        <xMin>170</xMin>
        <yMin>370</yMin>
        <xMax>320</xMax>
        <yMax>471</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
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
              <Chance>19</Chance>
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
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>429</x>
        <y>460</y>
        <position>
          <x>429</x>
          <y>460</y>
        </position>
        <center>
          <x>549.5</x>
          <y>524.5</y>
        </center>
        <min>
          <x>429</x>
          <y>460</y>
        </min>
        <max>
          <x>670</x>
          <y>589</y>
        </max>
        <width>241</width>
        <height>129</height>
        <size>
          <x>241</x>
          <y>129</y>
        </size>
        <xMin>429</xMin>
        <yMin>460</yMin>
        <xMax>670</xMax>
        <yMax>589</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You find a holodisc amongst the loot.

It seems to be an advertisement for the Lucky Peacock, the notorious travelling casino.

Since the casino travels all the time, it is difficult to locate. This holodisc holds the latest coordinates, however!</Text>
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
                <name>Wild Cards</name>
                <discription>You have found the coordinates of the Lucky Peacock, the travelling casino.

Head over and try your luck!</discription>
                <number>13</number>
                <nodes>
                  <ObjectiveNode>
                    <nodeDiscription />
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
          <Name>Throw it away.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>560</x>
        <y>312</y>
        <position>
          <x>560</x>
          <y>312</y>
        </position>
        <center>
          <x>635</x>
          <y>362</y>
        </center>
        <min>
          <x>560</x>
          <y>312</y>
        </min>
        <max>
          <x>710</x>
          <y>412</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>560</xMin>
        <yMin>312</yMin>
        <xMax>710</xMax>
        <yMax>412</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>This rock and roller supercharges his own engines and manages to catch up to your convoy.

A fight is inevitable.</Text>
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
          <Name>Damn!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>550</x>
        <y>138</y>
        <position>
          <x>550</x>
          <y>138</y>
        </position>
        <center>
          <x>628.5</x>
          <y>188</y>
        </center>
        <min>
          <x>550</x>
          <y>138</y>
        </min>
        <max>
          <x>707</x>
          <y>238</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>550</xMin>
        <yMin>138</yMin>
        <xMax>707</xMax>
        <yMax>238</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Your supercharged engines easily leave this sick raider behind.</Text>
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
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>R_D_A_Ambush1</Name>
</Scenario>