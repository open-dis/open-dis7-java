package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3370f42
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 16522
 */
public class M2655Hertha extends EntityType
{
    public M2655Hertha()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 16484, Mine Countermeasure Ship / Craft
        setSubCategory((byte)5); // uid 16518, Ariadne Class (Type 393 minesweepers, inshore)
        setSpecific((byte)4); // uid 16522, M 2655 Hertha
    }
}
