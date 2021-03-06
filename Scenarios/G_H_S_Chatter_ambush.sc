﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Radio</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/G_H_S_Chatter_ambush.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>26</x>
        <y>576</y>
        <position>
          <x>26</x>
          <y>576</y>
        </position>
        <center>
          <x>324.5</x>
          <y>651.6992</y>
        </center>
        <min>
          <x>26</x>
          <y>576</y>
        </min>
        <max>
          <x>623</x>
          <y>727.398438</y>
        </max>
        <width>597</width>
        <height>151.398438</height>
        <size>
          <x>597</x>
          <y>151.398438</y>
        </size>
        <xMin>26</xMin>
        <yMin>576</yMin>
        <xMax>623</xMax>
        <yMax>727.398438</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>The radio picks up chatter: ”Okay men, they’ll drive by any moment now, radio silence until they’re here!” </Text>
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
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Turn that ambush around!</Name>
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
                <x>585</x>
                <y>109</y>
                <position>
                  <x>585</x>
                  <y>109</y>
                </position>
                <center>
                  <x>590</x>
                  <y>114</y>
                </center>
                <min>
                  <x>585</x>
                  <y>109</y>
                </min>
                <max>
                  <x>595</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>585</xMin>
                <yMin>109</yMin>
                <xMax>595</xMax>
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
                <x>585</x>
                <y>127</y>
                <position>
                  <x>585</x>
                  <y>127</y>
                </position>
                <center>
                  <x>590</x>
                  <y>132</y>
                </center>
                <min>
                  <x>585</x>
                  <y>127</y>
                </min>
                <max>
                  <x>595</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>585</xMin>
                <yMin>127</yMin>
                <xMax>595</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Turn around and find a different path. </Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>26</x>
        <y>776</y>
        <position>
          <x>26</x>
          <y>776</y>
        </position>
        <center>
          <x>101</x>
          <y>826</y>
        </center>
        <min>
          <x>26</x>
          <y>776</y>
        </min>
        <max>
          <x>176</x>
          <y>876</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>26</xMin>
        <yMin>776</yMin>
        <xMax>176</xMax>
        <yMax>876</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]

You commend yourself on the fact that folks will no longer get ambushed here in the future.</Text>
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
          <Name>Take loot.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>739</x>
        <y>620</y>
        <position>
          <x>739</x>
          <y>620</y>
        </position>
        <center>
          <x>837.5</x>
          <y>692.5</y>
        </center>
        <min>
          <x>739</x>
          <y>620</y>
        </min>
        <max>
          <x>936</x>
          <y>765</y>
        </max>
        <width>197</width>
        <height>145</height>
        <size>
          <x>197</x>
          <y>145</y>
        </size>
        <xMin>739</xMin>
        <yMin>620</yMin>
        <xMax>936</xMax>
        <yMax>765</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>A scout noticed you diverting your path. They pursue your convoy!</Text>
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
          <Name>Stand your ground.</Name>
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
                <x>185</x>
                <y>109</y>
                <position>
                  <x>185</x>
                  <y>109</y>
                </position>
                <center>
                  <x>190</x>
                  <y>114</y>
                </center>
                <min>
                  <x>185</x>
                  <y>109</y>
                </min>
                <max>
                  <x>195</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>185</xMin>
                <yMin>109</yMin>
                <xMax>195</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>5</ToDialog>
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
                <x>185</x>
                <y>127</y>
                <position>
                  <x>185</x>
                  <y>127</y>
                </position>
                <center>
                  <x>190</x>
                  <y>132</y>
                </center>
                <min>
                  <x>185</x>
                  <y>127</y>
                </min>
                <max>
                  <x>195</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>185</xMin>
                <yMin>127</yMin>
                <xMax>195</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>673</x>
        <y>808</y>
        <position>
          <x>673</x>
          <y>808</y>
        </position>
        <center>
          <x>754.5</x>
          <y>858</y>
        </center>
        <min>
          <x>673</x>
          <y>808</y>
        </min>
        <max>
          <x>836</x>
          <y>908</y>
        </max>
        <width>163</width>
        <height>100</height>
        <size>
          <x>163</x>
          <y>100</y>
        </size>
        <xMin>673</xMin>
        <yMin>808</yMin>
        <xMax>836</xMax>
        <yMax>908</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You've managed to evade the ambush.</Text>
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
    <Dialog>
      <GraphRect>
        <x>1065</x>
        <y>839</y>
        <position>
          <x>1065</x>
          <y>839</y>
        </position>
        <center>
          <x>1154.5</x>
          <y>889.5</y>
        </center>
        <min>
          <x>1065</x>
          <y>839</y>
        </min>
        <max>
          <x>1244</x>
          <y>940</y>
        </max>
        <width>179</width>
        <height>101</height>
        <size>
          <x>179</x>
          <y>101</y>
        </size>
        <xMin>1065</xMin>
        <yMin>839</yMin>
        <xMax>1244</xMax>
        <yMax>940</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Despite your supercharged engines you've failed to escape.</Text>
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
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Damn!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1054</x>
        <y>695</y>
        <position>
          <x>1054</x>
          <y>695</y>
        </position>
        <center>
          <x>1132.5</x>
          <y>745</y>
        </center>
        <min>
          <x>1054</x>
          <y>695</y>
        </min>
        <max>
          <x>1211</x>
          <y>795</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>1054</xMin>
        <yMin>695</yMin>
        <xMax>1211</xMax>
        <yMax>795</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Your supercharged engines proved sufficient to escape!</Text>
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
  <Name>G_H_S_Chatter_ambush</Name>
</Scenario>