package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a8d39c4;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18353
 */
public class M5557Numana extends EntityType
{
    /** Default constructor */
    public M5557Numana()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 18344, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 18345, Gaeta Class
        setSpecific((byte)8); // uid 18353, M5557 Numana
    }
}
