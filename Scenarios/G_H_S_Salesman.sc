﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Radio</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/G_H_S_Salesman.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>220</x>
        <y>431</y>
        <position>
          <x>220</x>
          <y>431</y>
        </position>
        <center>
          <x>316</x>
          <y>495.5</y>
        </center>
        <min>
          <x>220</x>
          <y>431</y>
        </min>
        <max>
          <x>412</x>
          <y>560</y>
        </max>
        <width>192</width>
        <height>129</height>
        <size>
          <x>192</x>
          <y>129</y>
        </size>
        <xMin>220</xMin>
        <yMin>431</yMin>
        <xMax>412</xMax>
        <yMax>560</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>There is someone besides the road frantically flailing his arms. 

There is a sign besides him that reads: "Used car for sale!".

You see a big shape covered by a sheet.</Text>
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
                <x>180</x>
                <y>65</y>
                <position>
                  <x>180</x>
                  <y>65</y>
                </position>
                <center>
                  <x>185</x>
                  <y>70</y>
                </center>
                <min>
                  <x>180</x>
                  <y>65</y>
                </min>
                <max>
                  <x>190</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>180</xMin>
                <yMin>65</yMin>
                <xMax>190</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Approach the stranger.</Name>
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
          <Name>Ignore him.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>334</x>
        <y>627</y>
        <position>
          <x>334</x>
          <y>627</y>
        </position>
        <center>
          <x>409</x>
          <y>677</y>
        </center>
        <min>
          <x>334</x>
          <y>627</y>
        </min>
        <max>
          <x>484</x>
          <y>727</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>334</xMin>
        <yMin>627</yMin>
        <xMax>484</xMax>
        <yMax>727</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>not used cant remove!!
</Text>
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
              <ToDialog>100</ToDialog>
              <Close>false</Close>
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
        <x>474</x>
        <y>411</y>
        <position>
          <x>474</x>
          <y>411</y>
        </position>
        <center>
          <x>615</x>
          <y>486.699219</y>
        </center>
        <min>
          <x>474</x>
          <y>411</y>
        </min>
        <max>
          <x>756</x>
          <y>562.398438</y>
        </max>
        <width>282</width>
        <height>151.398438</height>
        <size>
          <x>282</x>
          <y>151.398438</y>
        </size>
        <xMin>474</xMin>
        <yMin>411</yMin>
        <xMax>756</xMax>
        <yMax>562.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you approach the man, you see he is wearing an oversized checkered jacket and a wide-brimmed hat. He is tapping his foot nervously on the ground and says the "car" is for sale for [0$], though he doesn't allow you to actually see it...</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>270</x>
                <y>65</y>
                <position>
                  <x>270</x>
                  <y>65</y>
                </position>
                <center>
                  <x>275</x>
                  <y>70</y>
                </center>
                <min>
                  <x>270</x>
                  <y>65</y>
                </min>
                <max>
                  <x>280</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>270</xMin>
                <yMin>65</yMin>
                <xMax>280</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-80</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>270</x>
                <y>83</y>
                <position>
                  <x>270</x>
                  <y>83</y>
                </position>
                <center>
                  <x>275</x>
                  <y>88</y>
                </center>
                <min>
                  <x>270</x>
                  <y>83</y>
                </min>
                <max>
                  <x>280</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>270</xMin>
                <yMin>83</yMin>
                <xMax>280</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-80</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Buy the "car" for [$]</Name>
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
          <Name>Leave, this man cannot be trusted.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>930</x>
        <y>310</y>
        <position>
          <x>930</x>
          <y>310</y>
        </position>
        <center>
          <x>1006</x>
          <y>360</y>
        </center>
        <min>
          <x>930</x>
          <y>310</y>
        </min>
        <max>
          <x>1082</x>
          <y>410</y>
        </max>
        <width>152</width>
        <height>100</height>
        <size>
          <x>152</x>
          <y>100</y>
        </size>
        <xMin>930</xMin>
        <yMin>310</yMin>
        <xMax>1082</xMax>
        <yMax>410</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After you pull off the sheet, you see a brand new vehicle! You thank the salesman for his fair deal.</Text>
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
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
              </_randomCars>
              <cars>
                <CarSetup>
                  <gridPos>
                    <x>0</x>
                    <y>0</y>
                  </gridPos>
                  <name>Stan's Deal</name>
                  <carName />
                  <controllType>player</controllType>
                  <slot1>3</slot1>
                  <slot2>0</slot2>
                  <slot3>0</slot3>
                  <slot4>0</slot4>
                  <unlocked>false</unlocked>
                </CarSetup>
              </cars>
              <randomCars>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
                <boolean>true</boolean>
              </randomCars>
            </ButtonAction>
          </Actions>
          <Name>Take the vehicle.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>865</x>
        <y>557</y>
        <position>
          <x>865</x>
          <y>557</y>
        </position>
        <center>
          <x>994.5</x>
          <y>607.5</y>
        </center>
        <min>
          <x>865</x>
          <y>557</y>
        </min>
        <max>
          <x>1124</x>
          <y>658</y>
        </max>
        <width>259</width>
        <height>101</height>
        <size>
          <x>259</x>
          <y>101</y>
        </size>
        <xMin>865</xMin>
        <yMin>557</yMin>
        <xMax>1124</xMax>
        <yMax>658</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After you pull off the sheet you see a large rock.

As you look for the salesman he seems to have disappeared.</Text>
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
          <Name>Curse the salesman and drive off.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_H_S_Salesman</Name>
</Scenario>