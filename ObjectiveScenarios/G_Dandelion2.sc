﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/ObjectiveScenarios/G_Dandelion2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>171</x>
        <y>420</y>
        <position>
          <x>171</x>
          <y>420</y>
        </position>
        <center>
          <x>294.5</x>
          <y>484.5</y>
        </center>
        <min>
          <x>171</x>
          <y>420</y>
        </min>
        <max>
          <x>418</x>
          <y>549</y>
        </max>
        <width>247</width>
        <height>129</height>
        <size>
          <x>247</x>
          <y>129</y>
        </size>
        <xMin>171</xMin>
        <yMin>420</yMin>
        <xMax>418</xMax>
        <yMax>549</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You arrive at the hill that was described by Audrey. It is littered with debris, wrecks and toxic sludge.

Atop the hill is a raider base, emitting vile black smoke and spilling toxic goo from its drainage pipes.

It is no surprise you were asked to clear them out.</Text>
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
                <x>235</x>
                <y>65</y>
                <position>
                  <x>235</x>
                  <y>65</y>
                </position>
                <center>
                  <x>240</x>
                  <y>70</y>
                </center>
                <min>
                  <x>235</x>
                  <y>65</y>
                </min>
                <max>
                  <x>245</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>235</xMin>
                <yMin>65</yMin>
                <xMax>245</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Attack the raiders!</Name>
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
          <Name>Actually, never mind.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>497</x>
        <y>710</y>
        <position>
          <x>497</x>
          <y>710</y>
        </position>
        <center>
          <x>572</x>
          <y>760</y>
        </center>
        <min>
          <x>497</x>
          <y>710</y>
        </min>
        <max>
          <x>647</x>
          <y>810</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>497</xMin>
        <yMin>710</yMin>
        <xMax>647</xMax>
        <yMax>810</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>With all the raider vehicles defeated, you get to looting and acquire: [0lootn].

As you eye the raider base spilling its vile filth on the hill, a flower-decorated vehicle approaches your convoy.</Text>
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
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Continue.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>531</x>
        <y>265</y>
        <position>
          <x>531</x>
          <y>265</y>
        </position>
        <center>
          <x>606</x>
          <y>315</y>
        </center>
        <min>
          <x>531</x>
          <y>265</y>
        </min>
        <max>
          <x>681</x>
          <y>365</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>531</xMin>
        <yMin>265</yMin>
        <xMax>681</xMax>
        <yMax>365</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The raiders saw you coming and move in to engage you head on!</Text>
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
              <difficulty>12</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>794</x>
        <y>568</y>
        <position>
          <x>794</x>
          <y>568</y>
        </position>
        <center>
          <x>869</x>
          <y>628.5</y>
        </center>
        <min>
          <x>794</x>
          <y>568</y>
        </min>
        <max>
          <x>944</x>
          <y>689</y>
        </max>
        <width>150</width>
        <height>121</height>
        <size>
          <x>150</x>
          <y>121</y>
        </size>
        <xMin>794</xMin>
        <yMin>568</yMin>
        <xMax>944</xMax>
        <yMax>689</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>From within the vehicle a young woman wearing an old-fashioned white dress appears. Her dandelion-coloured hair dances in the wind, while her dress swirls around her long and elegant legs.

She smiles brightly and says: "I knew you would find me, and I knew you would help me.

Sadly, the hill will never quite recover from its desecration, but with the raiders dead at least it won't get any worse.

And now we must go, we have a thousand things to do."</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCar">
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
              <_randomCars>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
              </_randomCars>
              <cars>
                <CarSetup>
                  <gridPos>
                    <x>0</x>
                    <y>0</y>
                  </gridPos>
                  <name>Julianne</name>
                  <carName>Flower</carName>
                  <controllType>player</controllType>
                  <slot1>37</slot1>
                  <slot2>7</slot2>
                  <slot3>7</slot3>
                  <slot4>0</slot4>
                  <unlocked>false</unlocked>
                </CarSetup>
              </cars>
              <randomCars>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
              </randomCars>
            </ButtonAction>
            <ButtonAction xsi:type="AddCar">
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
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <_randomCars>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
              </_randomCars>
              <cars>
                <CarSetup>
                  <gridPos>
                    <x>0</x>
                    <y>0</y>
                  </gridPos>
                  <name>Julianne</name>
                  <carName>Flower</carName>
                  <controllType>player</controllType>
                  <slot1>17</slot1>
                  <slot2>5</slot2>
                  <slot3>5</slot3>
                  <slot4>0</slot4>
                  <unlocked>false</unlocked>
                </CarSetup>
              </cars>
              <randomCars>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
              </randomCars>
            </ButtonAction>
            <ButtonAction xsi:type="AddCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>101</y>
                <position>
                  <x>138</x>
                  <y>101</y>
                </position>
                <center>
                  <x>143</x>
                  <y>106</y>
                </center>
                <min>
                  <x>138</x>
                  <y>101</y>
                </min>
                <max>
                  <x>148</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>101</yMin>
                <xMax>148</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <_randomCars>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
              </_randomCars>
              <cars>
                <CarSetup>
                  <gridPos>
                    <x>0</x>
                    <y>0</y>
                  </gridPos>
                  <name>Julianne</name>
                  <carName>Flower</carName>
                  <controllType>player</controllType>
                  <slot1>17</slot1>
                  <slot2>2</slot2>
                  <slot3>2</slot3>
                  <slot4>0</slot4>
                  <unlocked>false</unlocked>
                </CarSetup>
              </cars>
              <randomCars>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
                <boolean>false</boolean>
              </randomCars>
            </ButtonAction>
          </Actions>
          <Name>Let's go!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_Dandelion2</Name>
</Scenario>