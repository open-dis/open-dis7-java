package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@57fffcd7;
 * Country: Bulgaria (BGR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29951
 */
public class _62Shkval extends EntityType
{
    /** Default constructor */
    public _62Shkval()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27886, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 29949, Sonya Class
        setSpecific((byte)2); // uid 29951, 62 Shkval
    }
}
