package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@790174f2;
 * Country: Morocco (MAR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28865
 */
public class FrigateincludingCorvette extends EntityType
{
    /** Default constructor */
    public FrigateincludingCorvette()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28865, Frigate (including Corvette)
    }
}
