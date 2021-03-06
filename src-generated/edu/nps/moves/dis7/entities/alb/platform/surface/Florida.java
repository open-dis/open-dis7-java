package edu.nps.moves.dis7.entities.alb.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6267c3bb;
 * Country: Albania (ALB);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24481
 */
public class Florida extends EntityType
{
    /** Default constructor */
    public Florida()
    {
        setCountry(Country.ALBANIA_ALB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24479, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24480, Container Ship
        setSpecific((byte)1); // uid 24481, Florida
    }
}
