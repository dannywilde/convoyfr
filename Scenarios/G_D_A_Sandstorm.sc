﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/G_D_A_Sandstorm.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>403</x>
        <y>262</y>
        <position>
          <x>403</x>
          <y>262</y>
        </position>
        <center>
          <x>525.5</x>
          <y>335.5</y>
        </center>
        <min>
          <x>403</x>
          <y>262</y>
        </min>
        <max>
          <x>648</x>
          <y>409</y>
        </max>
        <width>245</width>
        <height>147</height>
        <size>
          <x>245</x>
          <y>147</y>
        </size>
        <xMin>403</xMin>
        <yMin>262</yMin>
        <xMax>648</xMax>
        <yMax>409</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>It seems you've driven straight into a sandstorm!

There is a severe risk of losing contact with one of your vehicles.</Text>
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
                <x>233</x>
                <y>65</y>
                <position>
                  <x>233</x>
                  <y>65</y>
                </position>
                <center>
                  <x>238</x>
                  <y>70</y>
                </center>
                <min>
                  <x>233</x>
                  <y>65</y>
                </min>
                <max>
                  <x>243</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>233</xMin>
                <yMin>65</yMin>
                <xMax>243</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="RemoveRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>233</x>
                <y>83</y>
                <position>
                  <x>233</x>
                  <y>83</y>
                </position>
                <center>
                  <x>238</x>
                  <y>88</y>
                </center>
                <min>
                  <x>233</x>
                  <y>83</y>
                </min>
                <max>
                  <x>243</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>233</xMin>
                <yMin>83</yMin>
                <xMax>243</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
            </ButtonAction>
          </Actions>
          <Name>Keep going, we've got to press on!</Name>
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
                <x>233</x>
                <y>127</y>
                <position>
                  <x>233</x>
                  <y>127</y>
                </position>
                <center>
                  <x>238</x>
                  <y>132</y>
                </center>
                <min>
                  <x>233</x>
                  <y>127</y>
                </min>
                <max>
                  <x>243</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>233</xMin>
                <yMin>127</yMin>
                <xMax>243</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-10</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Wait it out and be safe. [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>302</x>
        <y>623</y>
        <position>
          <x>302</x>
          <y>623</y>
        </position>
        <center>
          <x>377</x>
          <y>673</y>
        </center>
        <min>
          <x>302</x>
          <y>623</y>
        </min>
        <max>
          <x>452</x>
          <y>723</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>302</xMin>
        <yMin>623</yMin>
        <xMax>452</xMax>
        <yMax>723</yMax>
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
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
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
        <x>899</x>
        <y>201</y>
        <position>
          <x>899</x>
          <y>201</y>
        </position>
        <center>
          <x>977.5</x>
          <y>251</y>
        </center>
        <min>
          <x>899</x>
          <y>201</y>
        </min>
        <max>
          <x>1056</x>
          <y>301</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>899</xMin>
        <yMin>201</yMin>
        <xMax>1056</xMax>
        <yMax>301</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Eventually the storm passes and you manage to recover contact with your vehicles.</Text>
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
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>900</x>
        <y>318</y>
        <position>
          <x>900</x>
          <y>318</y>
        </position>
        <center>
          <x>978.5</x>
          <y>368</y>
        </center>
        <min>
          <x>900</x>
          <y>318</y>
        </min>
        <max>
          <x>1057</x>
          <y>418</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>900</xMin>
        <yMin>318</yMin>
        <xMax>1057</xMax>
        <yMax>418</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Eventually the storm passes and you round up your vehicles. Sadly, one of them has been lost without a trace.</Text>
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
          <Name>Damn...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_D_A_Sandstorm</Name>
</Scenario>