package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@607fbe09;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18360
 */
public class M5505Cedro extends EntityType
{
    /** Default constructor */
    public M5505Cedro()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 18344, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 18358, Adjutant Class
        setSpecific((byte)2); // uid 18360, M5505 Cedro
    }
}
