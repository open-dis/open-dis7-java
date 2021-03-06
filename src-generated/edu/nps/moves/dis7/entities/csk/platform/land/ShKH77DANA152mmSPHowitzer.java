package edu.nps.moves.dis7.entities.csk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6069db50;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22831
 */
public class ShKH77DANA152mmSPHowitzer extends EntityType
{
    /** Default constructor */
    public ShKH77DANA152mmSPHowitzer()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 22829, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 22830, Tatra T815 8x8 SP Howitzer
        setSpecific((byte)1); // uid 22831, ShKH-77 DANA 152 mm SP Howitzer
    }
}
