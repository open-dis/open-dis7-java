package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@217ed35e
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 25452
 */
public class MSD5Hirsholm extends EntityType
{
    public MSD5Hirsholm()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 25450, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 25451, Holm Class
        setSpecific((byte)1); // uid 25452, MSD5 Hirsholm
    }
}