package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@147e0734
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_PERSONNEL
 *
 * Entity type uid: 23983
 */
public class Cartridge762mmAPITLinkedBTZ extends EntityType
{
    public Cartridge762mmAPITLinkedBTZ()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 20637, Ballistic
        setSubCategory((byte)2); // uid 20641, 7.62 mm
        setSpecific((byte)7); // uid 23983, Cartridge, 7.62mm, API-T, Linked, BTZ
    }
}