package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@47ef968d;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24334
 */
public class BombardierCRJ900 extends EntityType
{
    /** Default constructor */
    public BombardierCRJ900()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23881, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23884, Twin Jet
        setSpecific((byte)3); // uid 24332, Bombardier CRJ700 Series
        setExtra((byte)2); // uid 24334, Bombardier CRJ900
    }
}
