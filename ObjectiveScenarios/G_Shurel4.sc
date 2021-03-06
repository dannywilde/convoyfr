﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/ObjectiveScenarios/G_Shurel4.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>66</x>
        <y>355</y>
        <position>
          <x>66</x>
          <y>355</y>
        </position>
        <center>
          <x>141.5</x>
          <y>405</y>
        </center>
        <min>
          <x>66</x>
          <y>355</y>
        </min>
        <max>
          <x>217</x>
          <y>455</y>
        </max>
        <width>151</width>
        <height>100</height>
        <size>
          <x>151</x>
          <y>100</y>
        </size>
        <xMin>66</xMin>
        <yMin>355</yMin>
        <xMax>217</xMax>
        <yMax>455</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>As you near the location of Shurel, you are once again contacted on the radio.</Text>
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
                <position>
                  <x>139</x>
                  <y>65</y>
                </position>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <min>
                  <x>139</x>
                  <y>65</y>
                </min>
                <max>
                  <x>149</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Respond.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>116</x>
        <y>798</y>
        <position>
          <x>116</x>
          <y>798</y>
        </position>
        <center>
          <x>192</x>
          <y>858.5</y>
        </center>
        <min>
          <x>116</x>
          <y>798</y>
        </min>
        <max>
          <x>268</x>
          <y>919</y>
        </max>
        <width>152</width>
        <height>121</height>
        <size>
          <x>152</x>
          <y>121</y>
        </size>
        <xMin>116</xMin>
        <yMin>798</yMin>
        <xMax>268</xMax>
        <yMax>919</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You've succesfully managed to destroy all the high tech vehicles protecting Shurel.

Scrapping the vehicles nets you [0$] and [0#]!</Text>
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
                <x>140</x>
                <y>65</y>
                <position>
                  <x>140</x>
                  <y>65</y>
                </position>
                <center>
                  <x>145</x>
                  <y>70</y>
                </center>
                <min>
                  <x>140</x>
                  <y>65</y>
                </min>
                <max>
                  <x>150</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>65</yMin>
                <xMax>150</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>156</Amount>
              <fuelAmount>31</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>83</y>
                <position>
                  <x>140</x>
                  <y>83</y>
                </position>
                <center>
                  <x>145</x>
                  <y>88</y>
                </center>
                <min>
                  <x>140</x>
                  <y>83</y>
                </min>
                <max>
                  <x>150</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>83</yMin>
                <xMax>150</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>187</Amount>
              <fuelAmount>25</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>101</y>
                <position>
                  <x>140</x>
                  <y>101</y>
                </position>
                <center>
                  <x>145</x>
                  <y>106</y>
                </center>
                <min>
                  <x>140</x>
                  <y>101</y>
                </min>
                <max>
                  <x>150</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>101</yMin>
                <xMax>150</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>211</Amount>
              <fuelAmount>21</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>382</x>
        <y>402</y>
        <position>
          <x>382</x>
          <y>402</y>
        </position>
        <center>
          <x>458</x>
          <y>471.5</y>
        </center>
        <min>
          <x>382</x>
          <y>402</y>
        </min>
        <max>
          <x>534</x>
          <y>541</y>
        </max>
        <width>152</width>
        <height>139</height>
        <size>
          <x>152</x>
          <y>139</y>
        </size>
        <xMin>382</xMin>
        <yMin>402</yMin>
        <xMax>534</xMax>
        <yMax>541</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Our scouts reported the destruction of all T.O.R.V.A.K. personnel and material.

You have our sincerest gratitude, we shall send an unmanned transport over right away."

Eventually, an unmanned transport vehicle approaches your convoy and unloads [0$].</Text>
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
                <x>140</x>
                <y>65</y>
                <position>
                  <x>140</x>
                  <y>65</y>
                </position>
                <center>
                  <x>145</x>
                  <y>70</y>
                </center>
                <min>
                  <x>140</x>
                  <y>65</y>
                </min>
                <max>
                  <x>150</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>65</yMin>
                <xMax>150</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>289</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>83</y>
                <position>
                  <x>140</x>
                  <y>83</y>
                </position>
                <center>
                  <x>145</x>
                  <y>88</y>
                </center>
                <min>
                  <x>140</x>
                  <y>83</y>
                </min>
                <max>
                  <x>150</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>83</yMin>
                <xMax>150</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>244</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>101</y>
                <position>
                  <x>140</x>
                  <y>101</y>
                </position>
                <center>
                  <x>145</x>
                  <y>106</y>
                </center>
                <min>
                  <x>140</x>
                  <y>101</y>
                </min>
                <max>
                  <x>150</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>101</yMin>
                <xMax>150</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>321</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>119</y>
                <position>
                  <x>140</x>
                  <y>119</y>
                </position>
                <center>
                  <x>145</x>
                  <y>124</y>
                </center>
                <min>
                  <x>140</x>
                  <y>119</y>
                </min>
                <max>
                  <x>150</x>
                  <y>129</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>119</yMin>
                <xMax>150</xMax>
                <yMax>129</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>652</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>678</x>
        <y>417</y>
        <position>
          <x>678</x>
          <y>417</y>
        </position>
        <center>
          <x>770.5</x>
          <y>481.5</y>
        </center>
        <min>
          <x>678</x>
          <y>417</y>
        </min>
        <max>
          <x>863</x>
          <y>546</y>
        </max>
        <width>185</width>
        <height>129</height>
        <size>
          <x>185</x>
          <y>129</y>
        </size>
        <xMin>678</xMin>
        <yMin>417</yMin>
        <xMax>863</xMax>
        <yMax>546</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"We thank you for your cooperation.

Nevertheless, we have to ask you to vacate the area to guarantee the safety of our people.

Please refrain from sharing these coordinates with anyone in the future."
</Text>
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
          <Name>"Will do, thanks!"</Name>
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
                <x>173</x>
                <y>109</y>
                <position>
                  <x>173</x>
                  <y>109</y>
                </position>
                <center>
                  <x>178</x>
                  <y>114</y>
                </center>
                <min>
                  <x>173</x>
                  <y>109</y>
                </min>
                <max>
                  <x>183</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>173</xMin>
                <yMin>109</yMin>
                <xMax>183</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>"Actually, now you die."</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>984</x>
        <y>600</y>
        <position>
          <x>984</x>
          <y>600</y>
        </position>
        <center>
          <x>1073.5</x>
          <y>664.4551</y>
        </center>
        <min>
          <x>984</x>
          <y>600</y>
        </min>
        <max>
          <x>1163</x>
          <y>728.910156</y>
        </max>
        <width>179</width>
        <height>128.910156</height>
        <size>
          <x>179</x>
          <y>128.910156</y>
        </size>
        <xMin>984</xMin>
        <yMin>600</yMin>
        <xMax>1163</xMax>
        <yMax>728.910156</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Betrayal after all that has happened?

We should have expected this, you disturbed the delicate balance between the factions as soon as your spaceship landed on Omek Prime.

It will be our pleasure to take you out."

A large number of high-tech vehicles seemingly appear out of nowhere, you suspect they're using stealth technology.

They move towards you aggressively.
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableMineField">
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
              <enemyType>Keepers</enemyType>
              <difficulty>3</difficulty>
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
              <enemyType>Keepers</enemyType>
              <difficulty>3</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Prepare to fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>376</x>
        <y>787</y>
        <position>
          <x>376</x>
          <y>787</y>
        </position>
        <center>
          <x>454.5</x>
          <y>837</y>
        </center>
        <min>
          <x>376</x>
          <y>787</y>
        </min>
        <max>
          <x>533</x>
          <y>887</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>376</xMin>
        <yMin>787</yMin>
        <xMax>533</xMax>
        <yMax>887</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After a thorough search you discover the entrance to an underground facility.

It appears to have gone in total lockdown after your actions. The blast doors have been sealed and you estimate it would take several weeks to cut through them.

Attempts to radio the facility prove fruitless. </Text>
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
          <Name>Leave.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_Shurel4</Name>
</Scenario>