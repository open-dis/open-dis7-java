package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4816c290;
 * Country: Libya (LBY);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27806
 */
public class _416TariqIbnZiyad extends EntityType
{
    /** Default constructor */
    public _416TariqIbnZiyad()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18922, Frigate(including Corvette)
        setSubCategory((byte)2); // uid 27805, Nanuchka II Class
        setSpecific((byte)1); // uid 27806, 416 Tariq Ibn Ziyad
    }
}
